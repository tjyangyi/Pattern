package composite;

import java.util.Iterator;
import java.util.Stack;

import component.MenuComponent;

public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		this.stack.push(iterator);
		//System.out.println(iterator + " is pushed into stack: " + this.stack);
	}

	@Override
	public boolean hasNext() {
	//	System.out.println("---------------------------");
	//	System.out.println("进入hasNext方法:" + this.toString());
	//	System.out.println("hasNext方法中:" + this.stack + "is empty?"
	//			+ this.stack.empty());
		if (this.stack.empty()) {
		//	System.out.println("离开hasNext方法,离开值为:" + false);
	//		System.out.println("---------------------------");
	//		System.out.println();
			return false;
		}
		Iterator<MenuComponent> iterator = this.stack.peek();
	//	System.out.println("hasNext方法中:iterator = " + iterator);
		if (iterator.hasNext()) {
		//	System.out.println("hasNext方法中:iterator = " + iterator
			//		+ " hasNext = true");
	//		System.out.println("离开hasNext方法,离开值为:" + true);
	//		System.out.println("---------------------------");
//			System.out.println();
			return true;
		} else {
	//		System.out.println("hasNext方法中:iterator = " + iterator
	//				+ " hasNext = false");
			this.stack.pop();
	//		System.out.println("hasNext方法中:" + this.stack + " pop");
			boolean has = this.hasNext();
	//		System.out.println("离开hasNext方法,离开值为:" + has);
	//		System.out.println("---------------------------");
		//	System.out.println();
			return has;
		}
	}

	@Override
	public MenuComponent next() {
	//	System.out.println("---------------------------");
	//	System.out.println("进入next方法:" + this.toString());
		if (!this.hasNext()) {
	//		System.out.println("离开next方法,离开值为:" + null);
	//		System.out.println("---------------------------");
	//		System.out.println();
			return null;
		}
		Iterator<MenuComponent> iterator = this.stack.peek();
	//	System.out.println("next方法中: iterator = " + iterator);
		MenuComponent menuComponent = iterator.next();
	//	System.out.println("next方法中: menuComponent = " + menuComponent);
	//	System.out.println("next方法中: menuComponent is Menu ? "
	//			+ (menuComponent instanceof Menu));
		if (menuComponent instanceof Menu) {
			Iterator<MenuComponent> compositeIterator = menuComponent.createIterator();
	//		System.out.println("next方法中:CompositeIterator被Push进入stack:"
				//	+ " menuComponent = " + compositeIterator
			//		+ "  stack = " + this.stack);
			this.stack.push(compositeIterator);
		}
	//	System.out.println("离开next方法,离开值为:" + menuComponent);
	//	System.out.println("---------------------------");
	//	System.out.println();
		return menuComponent;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
