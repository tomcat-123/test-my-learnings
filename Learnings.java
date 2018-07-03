package selenium;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Learnings {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		int n = 4;
		int count = n;
		Scanner sc = new Scanner(System.in);
		// * pattern
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i < count; i++) {
				System.out.print(" ");
			}
			count--;
			for (int j = 1; j <= k + (k - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// recursion in an array
		int a[][] = { { 1, 2, 8 }, { 4, 2, 2 }, { 2, 8, 2 } };
		int x = 2, y = 8;
		String name = a.getClass().getName();
		System.out.println(name);

		System.out.println(fun(a, a.length, x, y));

		// comparing string and First letter to Upper case
		String s = "java";
		String r = "java";
		int length = s.length() + r.length();
		System.out.println(length);

		if (s.compareTo(r) > 0) {
			System.out.println("Yes");
		} else if (s.compareTo(r) < 0) {
			System.out.println("No");
		} else {
			System.out.println("String are equal");
		}
		char[] c = s.toCharArray();
		char[] d = r.toCharArray();
		char m = Character.toUpperCase(c[0]);
		char b = Character.toUpperCase(d[0]);
		System.out.print(m);
		for (int i = 1; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.print(" " + b);
		for (int i = 1; i < d.length; i++) {
			System.out.print(d[i]);
		}
		System.out.println();
		// // odd and even within range
		// @SuppressWarnings("resource")
		// System.out.println("enter the number");
		// int N = sc.nextInt();
		// if (!(N % 2 == 0)) {
		// System.out.println("Weird");
		// } else if ((N % 2 == 0) && (2 <= N) && (N <= 5)) {
		// System.out.println("Not Weird");
		// } else if ((N % 2 == 0) && (6 <= N) && (N <= 20)) {
		// System.out.println("Weird");
		// } else if ((N % 2 == 0) && (20 < N)) {
		// System.out.println("Not Weird");
		// }
		//
		// // oder of output
		// System.out.println("enter the values");
		// int no = sc.nextInt();
		// double f = sc.nextDouble();
		// sc.nextLine();
		// String str = sc.nextLine();
		//
		// System.out.println("String: " + str);
		// System.out.println("Double: " + f);
		// System.out.println("Int: " + no);

		int j = 5;
		for (int i = 1; i <= 10; i++) {
			int result = j * i;
			System.out.println(j + " x " + i + " = " + result);
		}

		// string is palindrome
		String A = "aabbbaa";
		int strLength = A.length();
		StringBuilder revSec = new StringBuilder();
		if (strLength % 2 == 0) {
			String first = A.substring(0, strLength / 2);
			String sec = A.substring((strLength / 2), strLength);
			revSec.append(sec);
			revSec = revSec.reverse();
			if (first.contentEquals(revSec)) {
				System.out.println("palindrome,even");
			} else {
				System.out.println("no,even");
			}
		} else {
			String first = A.substring(0, strLength / 2);
			String sec = A.substring((strLength / 2) + 1, strLength);
			revSec.append(sec);
			revSec = revSec.reverse();
			if (first.contentEquals(revSec)) {
				System.out.println("palindrome");
			} else {
				System.out.println("no");
			}
		}
		StringBuilder rev = new StringBuilder();
		String w = "aabbaa";
		rev.append(w);
		rev = rev.reverse();
		System.out.println(rev);
		if (w.contentEquals(rev)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		// // Prime or not
		// System.out.println("enter a no to check prime or not");
		// long bi = sc.nextLong();
		// BigInteger B = new BigInteger(String.valueOf(bi));
		// if (B.isProbablePrime(1))
		// System.out.println("prime");
		// else
		// System.out.println("not prime");
		// System.out.println(B.nextProbablePrime());
		//
		// // read n line s of input
		// int countN = 1;
		// while (sc.hasNext()) {
		// System.out.println(countN + " " + sc.nextLine());
		// countN++;
		// }
		// System.out.println("enter Heigth and Breadth");
		// int Br = sc.nextInt();
		// int H = sc.nextInt();
		// if (Br > 0 && H > 0) {
		// System.out.println(Br * H);
		// } else {
		// System.out.println("java.lang.Exception: Breadth and height must be
		// positive");
		// }
		System.out.println("Play with List");
		int[] ar = { 2, 4, 3, 7, 5, 9, 1, 8 };
		List<Integer> arL = new ArrayList<>();
		for (int f : ar) {
			arL.add(f);
		}
		System.out.println(arL);
		Map<String, Object> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		set.addAll(arL);
		for (Integer h : set) {
			System.out.print(h);
		}
		System.out.println();
		LinkedHashSet<Integer> lset = new LinkedHashSet<>();
		lset.addAll(arL);
		for (Integer h : lset) {
			System.out.print(h);
		}
		System.out.println();
		TreeSet<Integer> tset = new TreeSet<>();
		tset.addAll(arL);
		for (Integer h : tset) {
			System.out.print(h);
		}

	}

	static int fun(int a[][], int n, int x, int y) {
		int rec = 0;
		int rec1 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (x == a[i][j]) {
					rec++;
				}
				if (y == a[i][j]) {
					rec1++;
				}
			}
		}
		System.out.println(rec1);
		return rec;
	}
}
