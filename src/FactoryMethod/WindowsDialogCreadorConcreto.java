package FactoryMethod;

public class WindowsDialogCreadorConcreto extends DialogCreadorBase {
    @Override
    public ButtonProducto createButton() {
        return new WindowsBtnProductoConcreto();
    }
}
