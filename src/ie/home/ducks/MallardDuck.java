package ie.home.ducks;

import ie.home.behavior.fly.FlyWithWings;
import ie.home.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I am a real mallard duck");
    }
}
