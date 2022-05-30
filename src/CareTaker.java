import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List <Memento> mementoList = new ArrayList<>();
    public void push(Memento state){
        mementoList.add(state);

    }
    public Memento pop(){
        var lastIndex = mementoList.size()- 1;
        var lastState = mementoList.get(lastIndex);
        mementoList.remove(lastState);

        return lastState;

    }
}
