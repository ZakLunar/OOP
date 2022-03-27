package init.chef.run;

import init.chef.salad.ingrigients.Ingredient;
import init.chef.salad.ingrigients.IngridientsCaloriesComparator;
import init.chef.salad.ingrigients.fruit.Orange;
import init.chef.salad.ingrigients.leaf.Mix;
import init.chef.salad.ingrigients.vegetable.Avocado;
import init.chef.salad.ingrigients.vegetable.Cucumber;
import init.chef.salad.Salad;
import init.chef.salad.ingrigients.vegetable.Tomato;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IngridientsCaloriesComparator ingridientsComparator = new IngridientsCaloriesComparator();
        Ingredient[] ingredientArray = new Ingredient[]{new Orange(), new Mix(), new Avocado(), new Cucumber(), new Tomato()};
        Salad salad = new Salad(ingredientArray);

        System.out.println(salad);
        System.out.println("It's all calories of salad - " + salad.AllCalories(ingredientArray));

        System.out.println("=== Sorting by calories from min to max ===");
        Arrays.sort(ingredientArray, ingridientsComparator);
        for (Ingredient i : ingredientArray) {
            System.out.println(i.getName());
        }

//        for (Ingredient ingredient : ingredientArray) {
//            System.out.println(ingredient.getName());
//        }
    }
}
