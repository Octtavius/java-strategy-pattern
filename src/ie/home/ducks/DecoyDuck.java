package ie.home.ducks;

import ie.home.behavior.fly.FlyNoWay;
import ie.home.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
