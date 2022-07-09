public class Test {
    public static void main(String[] args) {
        ObservableImpl observable=new ObservableImpl();
        Observer o1 =new ObserverImpl1();
        Observer o2=new ObserverImpl2();
        Observer o3=new ObserverImpl1();

        observable.subscribe(o1);
        observable.subscribe(o2);


        observable.setState(55);
        observable.setState(66);
        observable.unsubscribe(o1);
        observable.subscribe(new Observer() {  //alt +entrer pour remplacer avec lambda
            @Override
            public void update(int state) {  //Observable observable
                System.out.println("Observateur anonyme ");
            }
        });
        observable.setState(4);
    }
}
