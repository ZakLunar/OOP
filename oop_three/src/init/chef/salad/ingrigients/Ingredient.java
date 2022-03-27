package init.chef.salad.ingrigients;


import init.chef.salad.ingrigients.EnumIngridient.IngredientName;

public abstract class Ingredient {
    private int calories;
    private int weight;
    private int juice;
    private IngredientName name;

    public Ingredient(IngredientName name, int calories, int weight, int juice) {
        this.calories = calories;
        this.weight = weight;
        this.juice = juice;
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public int getWeight() {
        return weight;
    }

    public int getJuice() {
        return juice;
    }

    public IngredientName getName() {
        return name;
    }
}
