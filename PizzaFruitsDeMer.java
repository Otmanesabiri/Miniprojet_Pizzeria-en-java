public class PizzaFruitsDeMer extends Pizza {
    FabriqueIngredientsPizza fabriqueIngredients;

    public PizzaFruitsDeMer(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
    }

    @Override
    void preparer() {
        System.out.println("Préparation de " + nom);
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        moules = fabriqueIngredients.creerMoules();
    }
}
