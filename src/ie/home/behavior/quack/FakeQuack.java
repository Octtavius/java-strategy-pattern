package ie.home.behavior.quack;

public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
