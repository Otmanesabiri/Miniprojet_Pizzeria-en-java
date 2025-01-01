public class PizzaPoivrons extends Pizza {
    FabriqueIngredientsPizza fabriqueIngredients;

    public PizzaPoivrons(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
    }

    @Override
    void preparer() {
        System.out.println("Préparation de " + nom);
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        poivrons = fabriqueIngredients.creerPoivrons();
    }
}
