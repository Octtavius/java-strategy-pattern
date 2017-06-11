package ie.home.ducks;

import ie.home.behavior.fly.FlyBehaviour;
import ie.home.behavior.quack.QuackBehavior;

public abstract class Duck {
    //all ducks have fly and quack behavior. add thos properties
    FlyBehaviour flyBehaviour;
    QuackBehavior quackBehavior;

    public Duck(){}

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
