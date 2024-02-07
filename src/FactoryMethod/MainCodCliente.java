package FactoryMethod;

public class MainCodCliente {
    private static DialogCreadorBase dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();

    }

    static void configure (){
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialogCreadorConcreto();
        } else {
            dialog = new HtmlDialogCreadorConcreto();
        }
    }
    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
