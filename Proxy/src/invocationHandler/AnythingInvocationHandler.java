/**
 * 
 */
package invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author YangYi
 *
 */
public class AnythingInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try {
			return method.invoke(proxy, args);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

}
