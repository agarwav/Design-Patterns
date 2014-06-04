public interface Station {

    //add the observer
    public void registerObserver(Observer o);

    //remove the observer
    public void removeObserver(Observer o);

    //notify the observer
    public void notifyObservers();
}
