package init.chef.salad.ingrigients.EnumIngridient;

public enum IngredientName {
    LEMON("Lemon"),
    APPLE("Apple"),
    ORANGE("Orange"),
    ICEBOX("Icebox"),
    RUKKOLA("Rukkola"),
    MIX("Mix"),
    TOMATO("Tomato"),
    AVOCADO("Avocado"),
    CUCUMBER("Cucumber"),
    CARROT("Carrot");

    final String name;

    IngredientName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
