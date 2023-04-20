package teaching;
interface vehical{
    // abstract methods
    //No Body
    public void soundHorn();
    public void startEngine();

}

class car implements vehical{

    @Override
    public void soundHorn() {
        System.out.println("Sounding Horn");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");

    }
}
 abstract class Dog{
    public void run(){
        System.out.println("Running");
    }
    public abstract void bark();
 }
 class GermanShepherd extends Dog{

     @Override
     public void bark() {
         System.out.println("German Shepherd barking");
     }
 }

public class Main {
    public static void main(String[] args) {

        GermanShepherd g1= new GermanShepherd();
        g1.run();
        g1.bark();

        //        Car c1 = new Car();
//        c1.soundHorn();
//        c1.startEngine();

    }
}