package composite;

import java.util.Iterator;
import java.util.Stack;

import component.MenuComponent;

public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		this.stack.push(iterator);
		// System.out.println(iterator + " is pushed into stack: " +
		// this.stack);
	}

	@Override
	public boolean hasNext() {
		if (this.stack.empty()) {
			return false;
		}
		Iterator<MenuComponent> iterator = this.stack.peek();
		if (iterator.hasNext()) {
			return true;
		} else {
			this.stack.pop();
			boolean has = this.hasNext();
			return has;
		}
	}

	@Override
	public MenuComponent next() {
		if (!this.hasNext()) {
			return null;
		}
		Iterator<MenuComponent> iterator = this.stack.peek();
		MenuComponent menuComponent = iterator.next();
//		if (menuComponent instanceof Menu) {
//			Iterator<MenuComponent> compositeIterator = menuComponent
//					.createIterator();
//			this.stack.push(compositeIterator);
//		}
		return menuComponent;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
