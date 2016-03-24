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
	//	System.out.println("����hasNext����:" + this.toString());
	//	System.out.println("hasNext������:" + this.stack + "is empty?"
	//			+ this.stack.empty());
		if (this.stack.empty()) {
		//	System.out.println("�뿪hasNext����,�뿪ֵΪ:" + false);
	//		System.out.println("---------------------------");
	//		System.out.println();
			return false;
		}
		Iterator<MenuComponent> iterator = this.stack.peek();
	//	System.out.println("hasNext������:iterator = " + iterator);
		if (iterator.hasNext()) {
		//	System.out.println("hasNext������:iterator = " + iterator
			//		+ " hasNext = true");
	//		System.out.println("�뿪hasNext����,�뿪ֵΪ:" + true);
	//		System.out.println("---------------------------");
//			System.out.println();
			return true;
		} else {
	//		System.out.println("hasNext������:iterator = " + iterator
	//				+ " hasNext = false");
			this.stack.pop();
	//		System.out.println("hasNext������:" + this.stack + " pop");
			boolean has = this.hasNext();
	//		System.out.println("�뿪hasNext����,�뿪ֵΪ:" + has);
	//		System.out.println("---------------------------");
		//	System.out.println();
			return has;
		}
	}

	@Override
	public MenuComponent next() {
	//	System.out.println("---------------------------");
	//	System.out.println("����next����:" + this.toString());
		if (!this.hasNext()) {
	//		System.out.println("�뿪next����,�뿪ֵΪ:" + null);
	//		System.out.println("---------------------------");
	//		System.out.println();
			return null;
		}
		Iterator<MenuComponent> iterator = this.stack.peek();
	//	System.out.println("next������: iterator = " + iterator);
		MenuComponent menuComponent = iterator.next();
	//	System.out.println("next������: menuComponent = " + menuComponent);
	//	System.out.println("next������: menuComponent is Menu ? "
	//			+ (menuComponent instanceof Menu));
		if (menuComponent instanceof Menu) {
			Iterator<MenuComponent> compositeIterator = menuComponent.createIterator();
	//		System.out.println("next������:CompositeIterator��Push����stack:"
				//	+ " menuComponent = " + compositeIterator
			//		+ "  stack = " + this.stack);
			this.stack.push(compositeIterator);
		}
	//	System.out.println("�뿪next����,�뿪ֵΪ:" + menuComponent);
	//	System.out.println("---------------------------");
	//	System.out.println();
		return menuComponent;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
