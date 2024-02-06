package Singleton;

public class Singleton {
    private static Singleton instance = null;
    private int data = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
}