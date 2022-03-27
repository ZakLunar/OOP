package init.chef.ingrigients.EIngridient;

public enum IngredientName {
    LEMON("Lemon"),//,  , 50, 80),
    APPLE("Apple"),//, 24, 100, 170),
    ORANGE("Orange"),//, 30, 150, 300),
    ICEBOX("Icebox"),//, 6, 2, 42),
    RUKKOLA("Rukkola"),//, 5, 1, 21),
    LOLABONDA("Lolabonda"),// 9, 2, 37),
    MIX("Mix"), // 8, 3, 45),
    TOMATO("Tomato"),// 20, 35, 120),
    AVOCADO("Avocado"),// 56, 5, 145),
    CUCUMBER("Cucumber"),// 25, 27, 180),
    CARROT("Carrot");// 16, 22, 175);

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
