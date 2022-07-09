public interface Observable {
    public void subscribe(Observer o); //add Observer
    public void unsubscribe(Observer o);// remove observer
    public void notifyObserver();
}
