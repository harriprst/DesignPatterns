package Observer;

import java.util.Observable;

public class Mn {

    public static void main(String[] args) {

        Observer observer = new Observer();
        observer.add(new OnlineAccount());
        observer.add(new OfflineAccount());

        observer.notifyObservers();

    }
}
