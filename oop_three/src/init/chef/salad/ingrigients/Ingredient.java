package init.chef.salad.ingrigients;

import init.chef.salad.ingrigients.EnumIngridient.IngredientName;

import java.util.Objects;

public abstract class Ingredient {
    private final int calories;
    private final int weight;
    private final int juice;
    private final IngredientName name;

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

    @Override
    public String toString() {
        return name.toString();
    }

    @Override
    public boolean equals(Object i) {
        if (this == i) return true;
        if (i == null || getClass() != i.getClass()) return false;
        Ingredient ingredient = (Ingredient) i;
        return calories == ingredient.calories && weight == ingredient.weight && juice == ingredient.juice && name == ingredient.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(calories, weight, juice, name);
    }
}
