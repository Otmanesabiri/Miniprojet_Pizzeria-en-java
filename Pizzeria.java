public abstract class Pizzeria {

    protected abstract Pizza creerPizza(String choix);

    public Pizza commanderPizza(String choix) {
        Pizza pizza = creerPizza(choix);
        if (pizza != null) {
            pizza.preparer();
            pizza.cuire();
            pizza.couper();
            pizza.emballer();
        }
        return pizza;
    }
}
