package modle.DuckBehaviorImpl;

import modle.DuckBehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void performFly() {
		// TODO Auto-generated method stub
		System.out.println("This duck could not fly!");
	}

}
