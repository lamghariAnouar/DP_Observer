import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state=10;



    private List<Observer> observers=new ArrayList<>();
    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
      observers.remove(o);
    }

    @Override
    public void notifyObserver() {
       for(Observer o :observers){
           o.update(this.state);
       }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObserver();
    }
}
