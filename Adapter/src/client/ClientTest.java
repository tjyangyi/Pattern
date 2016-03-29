package client;

import target.Duck;
import adaptee.Turkey;
import adaptee.WildTurkey;
import adapter.TurkeyAdapter;

public class ClientTest {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		TurkeyAdapter adapter = new TurkeyAdapter(turkey);
		testDuck(adapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
