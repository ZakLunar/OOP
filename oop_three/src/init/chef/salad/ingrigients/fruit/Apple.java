package init.chef.salad.ingrigients.fruit;


import init.chef.salad.ingrigients.Ingredient;
import init.chef.salad.ingrigients.EnumIngridient.IngredientName;

public class Apple extends Ingredient {
    public Apple() {
        super(IngredientName.APPLE,24, 100, 170);
    }

//    public Apple() {
//        super(IngredientName.APPLE, 24, 100,170);
//    }

//    @Override
//    public int squeeze() {
//        return getJuice();
//    }
//
//    @Override
//    public void cutToHalf() {
//
//    }
}