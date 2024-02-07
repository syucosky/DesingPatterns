package FactoryMethod;

public class HtmlDialogCreadorConcreto extends DialogCreadorBase {
    @Override
    public ButtonProducto createButton() {
        return new HtmlBtnProductoConcreto();
    }
}
