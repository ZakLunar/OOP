package init.chef.salad;

import init.chef.salad.ingrigients.Ingredient;
import init.chef.salad.ingrigients.IngredientsComparator;


import java.util.Arrays;

public class Salad {

    public Salad(Ingredient[] ingredientArray) {
    }

    public void allCalories(Ingredient[] ingredientsArray){
        int callories = 0;
        for (Ingredient s : ingredientsArray ) {
            callories += s.getCalories();
        }
        System.out.println(", which contains - " + callories + " calories");

    }

    public void sortingBy(Ingredient[] ingredients, IngredientsComparator comparator){
        System.out.println("\n=== Sorting salad ingredients by calories from min to max ===");
        Arrays.sort(ingredients, comparator);
        for (Ingredient i : ingredients) {
            System.out.println(i.getName() + " - calories: " + i.getCalories());
        }
    }

    public void ingredientsInRangeOfCalories(Ingredient[] ingredients, int min, int max){
        System.out.println("\n=== Ingredients that contain " + min + " to " + max + " calories ===");
        for (Ingredient o : ingredients) {
            if (o.getCalories() > min && o.getCalories() < max){
                System.out.println(o.getName() + " - calories: " + o.getCalories());
            }
        }
    }

    public void displayAllIngredients(Ingredient[] ingredients){
        System.out.println("and these ingredients: ");
        for (Ingredient i : ingredients ) {
            System.out.println(" - " + i.getName());
        }
    }

    @Override
    public String toString(){
        return "This is our \"special\" salad";
    }
}
