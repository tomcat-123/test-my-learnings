package selenium;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.sun.jna.platform.win32.OaIdl.DATE;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
		int primeInReverse = 0, primeInForward = 0;
		int countInReverse = 0, countInForward = 0;

		PrimeNumber pn = new PrimeNumber();

		for (primeInReverse = n; primeInReverse > 1;) {
			primeInReverse--;
			countInReverse++;
			if (pn.primeNumber(primeInReverse)) {
				break;
			}
		}

		for (primeInForward = n; primeInForward > 1;) {
			primeInForward++;
			countInForward++;
			if (pn.primeNumber(primeInForward)) {
				break;
			}
		}

		if (countInReverse < countInForward) {
			System.out.println("closest prime no is in reverse direction:" + primeInReverse);
		} else if (countInReverse == countInForward) {
			System.out.println("closest prime no is :" + primeInForward + " and " + primeInReverse);
		} else {
			System.out.println("closest prime no is in forward direction:" + primeInForward);
		}

		// Anagrams
		pn.anagram("Keep", "Peek");
		// pn.anagram("Mother In Law", "Hitler Woman");

		// Seperate tokens
		// pn.token("he is, isn't he?");

		// Addition of a matrix elements
		// int[][] b = new int[3][3];
		// System.out.println("enter the matrix elements");
		// for (int i = 0; i < b.length; i++) {
		// for (int j = 0; j < b.length; j++) {
		// b[i][j] = sc.nextInt();
		// }
		// }
		// System.out.println("sum of matrix is: " + pn.addMatrix(b));

		// Calendar methods
		pn.calendar();

	}

	public boolean primeNumber(int n) {
		BigInteger b = new BigInteger(String.valueOf(n));

		if (n == 2) {
			return false;
		} else if (b.isProbablePrime(1)) {
			return true;
		} else {
			return false;
		}
	}

	public void anagram(String s1, String s2) {

		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		char[] c1 = str1.toLowerCase().toCharArray();
		char[] c2 = str2.toLowerCase().toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}

	}

	public void token(String st) {
		StringTokenizer stn = new StringTokenizer(st, " ,'?");
		System.out.println(stn.countTokens());
		while (stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
	}

	public int addMatrix(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}

	public void calendar() {
		String m = "06";
		String da = "14";
		String y = "2018";
		String date = m + " " + da + " " + y;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
		Date d = null;
		try {
			d = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdf.format(d));
		sdf = new SimpleDateFormat("EEEE");
		String q = sdf.format(d);
		System.out.println(q);
		cal.setTime(d);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

	}
}
