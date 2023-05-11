public class KidsMenu extends Menu {

    private static final double BASE_PRICE = 10.0;

    private String mainCourse;
    private String sideDish;
    private String toy;
    private double extraCost;

    @Override
    protected void assemble() {
        System.out.println("Montando cardápio infantil...");
        mainCourse = "Nuggets";
        sideDish = "Batata sorriso";
    }

    @Override
    protected void addExtras() {
        System.out.println("Adicionando brinquedo...");
        toy = "Boneco do filme XYZ";
        extraCost = 5.0;
    }

    @Override
    protected void calculatePrice() {
        double price = BASE_PRICE + extraCost;
        System.out.println("Preço do cardápio infantil: R$" + price);
    }
}