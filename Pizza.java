public abstract class Pizza {
    String nom;
    Pate pate;
    Sauce sauce;
    Legume[] legumes;
    Fromage fromage;
    Poivrons poivrons;
    Moules moules;

    abstract void preparer();

    void cuire() {
        System.out.println("Cuisson 25 minutes à 180°");
    }

    void couper() {
        System.out.println("Découpage en parts triangulaires");
    }

    void emballer() {
        System.out.println("Emballage dans une boîte officielle");
    }

    void setNom(String nom) {
        this.nom = nom;
    }

    String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder();
        details.append("Pizza : ").append(nom).append("\n");
        if (pate != null) details.append("Pâte : ").append(pate.getClass().getSimpleName()).append("\n");
        if (sauce != null) details.append("Sauce : ").append(sauce.getClass().getSimpleName()).append("\n");
        if (fromage != null) details.append("Fromage : ").append(fromage.getClass().getSimpleName()).append("\n");
        if (legumes != null) {
            details.append("Légumes : ");
            for (Legume legume : legumes) {
                details.append(legume.getClass().getSimpleName()).append(" ");
            }
            details.append("\n");
        }
        if (poivrons != null) details.append("Poivrons : ").append(poivrons.getClass().getSimpleName()).append("\n");
        if (moules != null) details.append("Moules : ").append(moules.getClass().getSimpleName()).append("\n");
        return details.toString();
    }
}
