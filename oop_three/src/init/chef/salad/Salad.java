package init.chef.salad;

import init.chef.ingrigients.Ingredient;

public class Salad {

    public Salad(Ingredient[] ingredientsArray) {
    }

    public int AllCalories(Ingredient[] array){
        int callories = 0;
        for (Ingredient s : array ) {
            callories += s.getCalories();
        }
        return callories;
    }

    @Override
    public String toString(){
        return "This is our special salad";
    }
}
