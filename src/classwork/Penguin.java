package classwork;

/**
 * Created by java on 06.02.2018.
 */
public class Penguin extends Birds implements CreateEggs {

    @Override
    public void sound() {
        System.out.println("pingvin zvyk");
    }

    @Override
    public void createEggs() {
        System.out.println("Penguin makes eggs");
    }
}
