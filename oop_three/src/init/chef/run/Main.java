package init.chef.run;

import init.chef.salad.ingrigients.Ingredient;
import init.chef.salad.ingrigients.fruit.Orange;
import init.chef.salad.ingrigients.leaf.Mix;
import init.chef.salad.ingrigients.vegetable.Avocado;
import init.chef.salad.ingrigients.vegetable.Cucumber;
import init.chef.salad.Salad;

public class Main {
    public static void main(String[] args) {
//        Ingredient vegetable1 = new Avocado();
//        Ingredient vegetable2 = new Carrot();
//        Ingredient vegetable3 = new Cucumber();
//        Ingredient vegetable4 = new Tomato();
//        Ingredient leaf1 = new Icebox();
//        Ingredient leaf2 = new Mix();
//        Ingredient leaf3 = new Rukkola();
//        Ingredient fruit1 = new Apple();
//        Ingredient fruit2 = new Lemon();
//        Ingredient fruit3 = new Orange();
//        Ingredient ingredient = new Apple();
//
//        Ingredient[] salad1 = {vegetable1, vegetable2, fruit1, leaf2};

        Ingredient[] ingredientArray = new Ingredient[]{new Orange(), new Mix(), new Avocado(), new Cucumber(), new Avocado()};
        Salad salad = new Salad(ingredientArray);


        System.out.println("It's all calories of salad - " + salad.AllCalories(ingredientArray));
        System.out.println(salad);

        //Arrays.sort(ingredientArray, );
        for (Ingredient ingredient : ingredientArray) {
            System.out.println(ingredient.getName());
        }
    }
}
