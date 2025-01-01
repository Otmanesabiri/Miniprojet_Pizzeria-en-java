public class FabriqueIngredientsPizzaBrest implements FabriqueIngredientsPizza {

    @Override
    public Pate creerPate() {
        return new PateFine();
    }

    @Override
    public Sauce creerSauce() {
        return new SauceMarinara();
    }

    @Override
    public Fromage creerFromage() {
        return new Reggiano();
    }

    @Override
    public Legume[] creerLegumes() {
        Legume[] legumes = { new Ail(), new Oignon(), new Champignon(), new PoivronRouge() };
        return legumes;
    }

    @Override
    public Poivrons creerPoivrons() {
        return new PoivronsEnRondelles();
    }

    @Override
    public Moules creerMoules() {
        return new MoulesFraiches();
    }
}
