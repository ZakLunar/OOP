package init.chiefСook.run;

import init.chiefСook.salad.ingrigients.Ingredient;
import init.chiefСook.salad.ingrigients.fruit.Orange;
import init.chiefСook.salad.ingrigients.leaf.Mix;
import init.chiefСook.salad.ingrigients.vegetable.Avocado;
import init.chiefСook.salad.ingrigients.vegetable.Cucumber;
import init.chiefСook.salad.Salad;
import init.chiefСook.salad.ingrigients.vegetable.Tomato;
import static init.chiefСook.salad.ingrigients.IngredientsComparator.caloriesComparator;

public class Main {
    public static void main(String[] args) {
        Ingredient[] ingredientArray = new Ingredient[]{new Orange(), new Mix(), new Avocado(), new Cucumber(), new Tomato()};
        Salad salad = new Salad(ingredientArray);

        System.out.print("""
                    -----
                === SALAD ===
                    -----""".indent(10));

        System.out.print(salad);
        salad.allCalories(ingredientArray); //all calories

        salad.displayAllIngredients(ingredientArray); //all ingredients

        salad.sortingBy(ingredientArray, caloriesComparator); //sorting by calories

        salad.ingredientsInRangeOfCalories(ingredientArray, 15, 40); //ingredients in range of calories
    }
}
