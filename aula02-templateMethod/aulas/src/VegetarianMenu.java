public class VegetarianMenu extends Menu {

    private static final double BASE_PRICE = 12.0;

    private String mainCourse;
    private String sideDish;
    private String container;
    private double containerCost;
    private double seasoningSurcharge;

    @Override
    protected void assemble() {
        System.out.println("Montando cardápio vegetariano...");
        mainCourse = "Hambúrguer vegetariano";
        sideDish = "Salada";
    }

    @Override
    protected void addExtras() {
        System.out.println("Adicionando embalagem especial e temperos...");
        container = "Embalagem de papelão reciclado";
        containerCost = 2.0;
        seasoningSurcharge = BASE_PRICE * 0.01;
    }

    @Override
    protected void calculatePrice() {
        double price = BASE_PRICE + containerCost + seasoningSurcharge;
        System.out.println("Preço do cardápio vegetariano: R$" + price);
    }
}