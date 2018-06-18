package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import modle.DuckBehaviorImpl.FlyNoWay;
import modle.DuckBehaviorImpl.FlyWithRocket;
import modle.DuckBehaviorImpl.FlyWithWings;
import modle.DuckBehaviorImpl.MuteQuack;
import modle.DuckBehaviorImpl.Quack;
import modle.DuckBehaviorImpl.Squeak;
import modle.DuckType.MallardDuck;
import modle.DuckType.RedheadDuck;
import modle.DuckType.RubberDuck;



public class DuckTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		Quack quack=new Quack();
		Squeak squack=new Squeak();
		MuteQuack mutequack=new MuteQuack();
		
		FlyWithWings flyWithWings=new FlyWithWings ();
		FlyWithRocket flyWithRocket=new FlyWithRocket ();
		FlyNoWay flyNoWay=new FlyNoWay ();
		
		MallardDuck mallardduck=new MallardDuck(quack,flyWithWings);
		RedheadDuck redheadduck=new RedheadDuck(squack,flyWithRocket);
		RubberDuck rubberduck=new RubberDuck(mutequack,flyNoWay);
		
		mallardduck.display();
		redheadduck.display();
		rubberduck.display();
		
	}

}
