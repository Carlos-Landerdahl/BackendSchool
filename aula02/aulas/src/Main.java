public class Main {
    public static void main(String[] args) {

        Menu adultMenu = new AdultMenu();
        adultMenu.prepareMenu();
        System.out.println();

        Menu kidsMenu = new KidsMenu();
        kidsMenu.prepareMenu();
        System.out.println();

        Menu vegetarianMenu = new VegetarianMenu();
        vegetarianMenu.prepareMenu();
    }

}