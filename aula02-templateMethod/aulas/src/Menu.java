public abstract class Menu {

    public final void prepareMenu() {
        assemble();
        addExtras();
        calculatePrice();
    }

    protected abstract void assemble();

    protected abstract void addExtras();

    protected abstract void calculatePrice();
}