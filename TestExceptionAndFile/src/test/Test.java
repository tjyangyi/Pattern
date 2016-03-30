package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			System.out.println("main中打印的:" + e.getClass());
		}
	}

	public static void test() throws Exception {
		String filePath = "d:\\123.txt";
		File file = new File(filePath);
		OutputStream out = new FileOutputStream(file);
		try {
			for (int i = 0; i < 10; i++) {
				if (i == 4) {
					System.out.println(1 / 0);
				}
				out.write(56);
			}
		} catch (Exception e) {
			System.out.println("第一个catch中打印的：" + e);
			throw new Exception1();
		} finally {
			try {
				if (out != null) {
					System.out.println(1 / 0);
					out.flush();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				System.out.println("第二个catch中打印的：" + e);
				throw new Exception2();
			}
		}
	}

}

class Exception1 extends Exception {
	private static final long serialVersionUID = -485795154664124901L;
}

class Exception2 extends Exception {
	private static final long serialVersionUID = 8781501707041656589L;
}
