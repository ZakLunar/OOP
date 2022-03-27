package init.chef.salad.ingrigients;

import java.util.Comparator;

public class IngridientsCaloriesComparator implements Comparator<Ingredient> {

    @Override
    public int compare(Ingredient i1, Ingredient i2){
        return i1.getCalories() - i2.getCalories();
    }
}
