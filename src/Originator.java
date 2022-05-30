public class Originator {
    private String state;


    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createState(){
        return new Memento(state);

    }

    public void restore(Memento content){
        state = content.getState();


    }
}
