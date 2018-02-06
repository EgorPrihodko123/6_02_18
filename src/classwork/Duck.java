package classwork;

/**
 * Created by java on 06.02.2018.
 */
public class  Duck extends Birds implements Fly, CreateEggs {

    @Override
    public void fly() {
        System.out.println("i can fly");
    }

    @Override
    public void sound() {
        System.out.println("I am krya");
    }

    @Override
    public void createEggs() {
        System.out.println("I am duck,i can create eggs");
    }
}
