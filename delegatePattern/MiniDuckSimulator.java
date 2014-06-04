public class MiniDuckSimulator {
    public static void main(String args[]) {
        Duck mds = new ModelDuck();
        mds.performFly();
        mds.performQuack();

        mds.setFlyBehavior(new FlyWithRocket());
        mds.performFly();
    }
}
