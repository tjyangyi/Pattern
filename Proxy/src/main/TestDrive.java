package main;

import proxy.ProxyFactory;
import realsubject.PersonBeanImpl;
import subject.PersonBean;

public class TestDrive {

	public static void main(String[] args) {
		PersonBean yy = new PersonBeanImpl("yy", "male", "basketball");
		PersonBean ownerProxy = ProxyFactory.getOwnerProxy(yy);
		System.out.println("Name = " + ownerProxy.getName());
		ownerProxy.setInterests("football");
		System.out.println("Interest = " + ownerProxy.getInterests());
		try {
			ownerProxy.setHotOrNotRating(5);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}

		PersonBean nonOwnerPorxy = ProxyFactory.getNonOwnerProxy(yy);
		System.out.println(nonOwnerPorxy.getName());
		try {
			nonOwnerPorxy.setInterests("bwoling");
		} catch (Exception e) {
			System.out.println("Can't set interets from non owner proxy");
		}
		nonOwnerPorxy.setHotOrNotRating(9);
		System.out.println("rating is " + nonOwnerPorxy.getHotOrNotRating());

	}
}
