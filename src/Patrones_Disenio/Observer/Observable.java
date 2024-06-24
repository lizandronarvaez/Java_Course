package Patrones_Disenio.Observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
    
    protected List<Observer> observers=new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    };

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
