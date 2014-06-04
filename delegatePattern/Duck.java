public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void Duck(){
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("all the ducks swim");
    }

    public void setFlyBehavior(FlyBehavior newFlyBehavior) {
        flyBehavior = newFlyBehavior;
    }

    public void setQuackBehavior(QuackBehavior newQuackBehavior) {
        quackBehavior = newQuackBehavior;
    }
}
