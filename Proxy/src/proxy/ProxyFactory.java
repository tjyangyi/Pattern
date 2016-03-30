package proxy;

import invocationHandler.AnythingInvocationHandler;
import invocationHandler.NonOwnerInvocationHandler;
import invocationHandler.OwnerInvocationHandler;

import java.lang.reflect.Proxy;

import subject.PersonBean;

public class ProxyFactory {
	public static PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass()
				.getClassLoader(), person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}

	public static PersonBean getNonOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass()
				.getClassLoader(), person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}

	public static Object getProxy(Object object) {
		return (Object) Proxy.newProxyInstance(object.getClass()
				.getClassLoader(), object.getClass().getInterfaces(),
				new AnythingInvocationHandler());
	}

}
