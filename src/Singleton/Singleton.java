package Singleton;

public class Singleton {
    private static Singleton instance = new Singleton();
    private int counter = 0;
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
    public Integer getCounter(){
        return ++this.counter;
    }
}
