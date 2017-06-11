package ie.home.ducks;

import ie.home.behavior.fly.FlyNoWay;
import ie.home.behavior.quack.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
