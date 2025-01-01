public class TestPizzeria {
    public static void main(String[] args) {
        Pizzeria pizzeria = new PizzeriaBrest();

        Pizza pizzaFromage = pizzeria.commanderPizza("fromage");
        System.out.println(pizzaFromage);

        Pizza pizzaVegetarienne = pizzeria.commanderPizza("vegetarienne");
        System.out.println(pizzaVegetarienne);

        Pizza pizzaFruitsDeMer = pizzeria.commanderPizza("fruitsDeMer");
        System.out.println(pizzaFruitsDeMer);

        Pizza pizzaPoivrons = pizzeria.commanderPizza("poivrons");
        System.out.println(pizzaPoivrons);
    }
}
