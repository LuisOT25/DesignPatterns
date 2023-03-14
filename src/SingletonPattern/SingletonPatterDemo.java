package Singleton_Pattern;

public class SingletonPatterDemo {
    public static void main(String[] args) {
       //SingleObject object = new SingleObject();

        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
