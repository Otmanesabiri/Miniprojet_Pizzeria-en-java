public class PizzeriaBrest extends Pizzeria {

    protected Pizza creerPizza(String choix) {
        Pizza pizza = null;
        FabriqueIngredientsPizza fabriqueIngredients = new FabriqueIngredientsPizzaBrest();

        if (choix.equals("fromage")) {
            pizza = new PizzaFromage(fabriqueIngredients);
            pizza.setNom("Pizza au fromage style Brest");
        } else if (choix.equals("vegetarienne")) {
            pizza = new PizzaVegetarienne(fabriqueIngredients);
            pizza.setNom("Pizza végétarienne style Brest");
        } else if (choix.equals("fruitsDeMer")) {
            pizza = new PizzaFruitsDeMer(fabriqueIngredients);
            pizza.setNom("Pizza aux fruits de mer style Brest");
        } else if (choix.equals("poivrons")) {
            pizza = new PizzaPoivrons(fabriqueIngredients);
            pizza.setNom("Pizza aux poivrons style Brest");
        }

        return pizza;
    }
}
