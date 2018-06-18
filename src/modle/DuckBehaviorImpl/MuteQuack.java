package modle.DuckBehaviorImpl;

import modle.DuckBehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void performQuack() {
		// TODO Auto-generated method stub
		System.out.println("This duck could not quack!");
	}

}
