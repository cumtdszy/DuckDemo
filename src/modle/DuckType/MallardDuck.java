package modle.DuckType;

import modle.DuckBehavior.FlyBehavior;
import modle.DuckBehavior.QuackBehavior;

public class MallardDuck extends Duck{

	public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
		super(quackBehavior, flyBehavior);
		// TODO Auto-generated constructor stub
	}
	
	public void display(){
		System.out.println("I am a mallardDuck!");
		performQuack();
		performFly();
	}
}
