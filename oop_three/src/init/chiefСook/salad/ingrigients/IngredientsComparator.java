package init.chiefСook.salad.ingrigients;

import java.util.Comparator;

public abstract class IngredientsComparator implements Comparator<Ingredient>{

    public static IngredientsComparator caloriesComparator = new IngredientsComparator(){
        public int compare(Ingredient i1, Ingredient i2) {
            return i1.getCalories() - i2.getCalories();
        }
    };

    public static IngredientsComparator juiceComparator = new IngredientsComparator(){
        public int compare(Ingredient i1, Ingredient i2) {
            return i1.getJuice() - i2.getJuice();
        }
    };
}

