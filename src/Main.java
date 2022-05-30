public class Main {


    public static void main(String[] args){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("Balu");
        careTaker.push( originator.createState());
        originator.setState("Programmer");
        careTaker.push( originator.createState());
        originator.setState("Developer");
        careTaker.push( originator.createState());
        originator.setState("web");
        careTaker.push( originator.createState());
        originator.setState("python");


        originator.restore(careTaker.pop());
        originator.restore(careTaker.pop());
        originator.restore(careTaker.pop());
        originator.restore(careTaker.pop());





        System.out.println("Current State: "+ originator.getState());






    }
}
