public class AdultMenu extends Menu {

    private static final double BASE_PRICE = 15.0;

    private String mainCourse;
    private String sideDish;

    @Override
    protected void assemble() {
        System.out.println("Montando cardápio adulto...");
        mainCourse = "Hambúrguer";
        sideDish = "Batata frita";
    }

    @Override
    protected void addExtras() {
        System.out.println("Cardápio adulto não possui extras.");
    }

    @Override
    protected void calculatePrice() {
        double price = BASE_PRICE;
        System.out.println("Preço do cardápio adulto: R$" + price);
    }
}
