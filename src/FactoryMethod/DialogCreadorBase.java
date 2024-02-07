package FactoryMethod;

public abstract class DialogCreadorBase {

    public void renderWindow() {

        ButtonProducto okButton = createButton();
        okButton.render();
    }
    public abstract ButtonProducto createButton();

}
