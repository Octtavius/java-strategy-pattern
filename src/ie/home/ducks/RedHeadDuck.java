package ie.home.ducks;

import ie.home.behavior.fly.FlyWithWings;
import ie.home.behavior.quack.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehaviour= new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
