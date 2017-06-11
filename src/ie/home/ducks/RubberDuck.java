package ie.home.ducks;

import ie.home.behavior.fly.FlyNoWay;
import ie.home.behavior.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("I'm a rubber duck");
    }
}
