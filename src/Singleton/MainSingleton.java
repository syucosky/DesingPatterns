package Singleton;

public class MainSingleton {

    public static void main(String[] args) {
    System.out.println("Creo instancia");
    Singleton singleton = Singleton.getInstance();
    singleton.setData(1);System.out.print("Primera instancia:  ");
    System.out.println(singleton.getData());

    System.out.println("Intento tener otra instacia y la imprimo");
    Singleton singleton2 = Singleton.getInstance();
    System.out.println(singleton2.getData());


    }
}
