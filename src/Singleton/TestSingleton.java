package Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Integer in1 = Singleton.getInstance().getCounter();
        Integer in2 = Singleton.getInstance().getCounter();

        System.out.println(in1 + " " + in2);
    }
}
