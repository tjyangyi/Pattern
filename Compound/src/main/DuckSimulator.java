package main;

import observer.QuackObserver;
import observer.Quackologist;
import component.Flock;
import adapter.GooseAdapter;
import decorator.QuackCounter;
import duck.DuckCall;
import duck.MallardDuck;
import duck.RedheadDuck;
import duck.RubberDuck;
import factory.AbstractDuckFactory;
import factory.CountingDuckFactory;
import goose.Goose;
import interfaces.Quackable;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator duckSimulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		duckSimulator.simulate1();
		duckSimulator.simulate2();
		duckSimulator.simulate3(duckFactory);
		duckSimulator.simulate4(duckFactory);
		duckSimulator.simulate5(duckFactory);
	}

	private void simulate1() {
		System.out.println("鸭子模拟器1开始工作");

		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		this.simulate(mallardDuck);
		this.simulate(redheadDuck);
		this.simulate(duckCall);
		this.simulate(rubberDuck);
		this.simulate(gooseDuck);
		System.out.println();
	}

	private void simulate2() {
		System.out.println("鸭子模拟器2开始工作,有计数器装饰者");

		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));

		this.simulate(mallardDuck);
		this.simulate(redheadDuck);
		this.simulate(duckCall);
		this.simulate(rubberDuck);
		this.simulate(gooseDuck);

		System.out.println("一共叫了" + QuackCounter.getQuackNumber() + "声");
		System.out.println();
	}

	private void simulate3(AbstractDuckFactory duckFactory) {
		System.out.println("鸭子模拟器3开始工作,抽象工厂生成的对象");

		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();

		this.simulate(mallardDuck);
		this.simulate(redheadDuck);
		this.simulate(duckCall);
		this.simulate(rubberDuck);

		System.out.println("一共叫了" + QuackCounter.getQuackNumber() + "声");
		System.out.println();
	}

	private void simulate4(AbstractDuckFactory duckFactory) {
		System.out.println("鸭子模拟器4开始工作,使用组合模式,建立鸭群");
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();

		Flock flockOfDucks = new Flock();
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);

		Flock flockOfMallards = new Flock();
		Quackable mallardDuck1 = duckFactory.createMallardDuck();
		Quackable mallardDuck2 = duckFactory.createMallardDuck();
		Quackable mallardDuck3 = duckFactory.createMallardDuck();
		Quackable mallardDuck4 = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardDuck1);
		flockOfMallards.add(mallardDuck2);
		flockOfMallards.add(mallardDuck3);
		flockOfMallards.add(mallardDuck4);

		flockOfDucks.add(flockOfMallards);

		this.simulate(flockOfDucks);

		System.out.println("一共叫了" + QuackCounter.getQuackNumber() + "声");
		System.out.println();
	}

	private void simulate5(AbstractDuckFactory duckFactory) {
		System.out.println("鸭子模拟器5开始工作,使用组合模式,建立鸭群，并且加入了鸭叫观察者");
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();

		Flock flockOfDucks = new Flock();
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);

		Flock flockOfMallards = new Flock();
		Quackable mallardDuck1 = duckFactory.createMallardDuck();
		Quackable mallardDuck2 = duckFactory.createMallardDuck();
		Quackable mallardDuck3 = duckFactory.createMallardDuck();
		Quackable mallardDuck4 = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardDuck1);
		flockOfMallards.add(mallardDuck2);
		flockOfMallards.add(mallardDuck3);
		flockOfMallards.add(mallardDuck4);

		flockOfDucks.add(flockOfMallards);
		
		Quackable gooseDuck = new GooseAdapter(new Goose());
		flockOfDucks.add(gooseDuck);

		QuackObserver quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		this.simulate(flockOfDucks);

		System.out.println("一共叫了" + QuackCounter.getQuackNumber() + "声");
		System.out.println();
	}

	private void simulate(Quackable quackable) {
		quackable.quack();
	}

}
