package classwork;


public class Eagle extends Birds implements Fly {


    @Override
    public void fly() {
        System.out.println("I am eagle");
    }

    @Override
    public void sound() {
        System.out.println("I am sound of deagle");
    }
}
