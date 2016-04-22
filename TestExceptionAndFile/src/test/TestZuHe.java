package test;

import java.math.BigInteger;

public class TestZuHe {

	public static void main(String[] args) {
		System.out.println(getZuHe(150, 1));
	}

	// n
	// C =
	// m
	private static BigInteger getZuHe(long m, long n) {
		BigInteger fenmu = BigInteger.valueOf(1);
		BigInteger fenzi = BigInteger.valueOf(1);
		for (long i = n; i >= 1; i--, m--) {
			fenzi = fenzi.multiply(BigInteger.valueOf(m));
			fenmu = fenmu.multiply(BigInteger.valueOf(i));
		}
		return fenzi.divide(fenmu);
	}
}
