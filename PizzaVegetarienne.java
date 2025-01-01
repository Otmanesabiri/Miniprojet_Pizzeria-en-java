public class PizzaVegetarienne extends Pizza {
    FabriqueIngredientsPizza fabriqueIngredients;

    public PizzaVegetarienne(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
    }

    @Override
    void preparer() {
        System.out.println("Préparation de " + nom);
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        legumes = fabriqueIngredients.creerLegumes();
    }
}
