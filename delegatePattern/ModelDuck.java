public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyWithoutWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a realistic duck.");
    }
}
