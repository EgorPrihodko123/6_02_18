package classwork;


public class Runner {
    public static void main(String[] args) {


        Birds eagle = new Eagle();
        Birds duck = new Duck();
        Birds rubDuck=new RubberDuck();
       // eagle.sound();
       // duck.sound();

        Birds[] birds=new Birds[3];
        birds[0]=eagle;
        birds[1]=duck;
        birds[2]= rubDuck;
        for (Birds birs:birds) {

        }
        CreateEggs pingvin=new Penguin();
        CreateEggs ducks=new Duck();
        CreateEggs[] mass=new CreateEggs[2];
        mass[0]=pingvin;
        mass[1]=ducks;

        for (CreateEggs mas:mass) {
           mas.createEggs();
        }
    }
}