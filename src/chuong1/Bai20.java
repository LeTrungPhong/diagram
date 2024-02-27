package chuong1;

import java.util.Scanner;

public class Bai20 {
	
	public static int sttFibonaci(int m) {
		int fb1 = 0;
		int fb2 = 1;
		int count = 1;
		do {
			int temp = fb2;
			fb2 = fb2 + fb1;
			fb1 = temp;
			++count;
			if(m == fb2) {
				return count;
			}
		}while(fb2 <= m);
		return 0;
	}
	
	public static boolean ktFibonaci(int m) {
		int fb1 = 0;
		int fb2 = 1;
		int count = 1;
		do {
			int temp = fb2;
			fb2 = fb2 + fb1;
			fb1 = temp;
			++count;
			if(m == fb2) {
				return true;
			}
		}while(fb2 <= m);
		return false;
	}
	
	public static void resolve() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap k: ");
		int k = scanner.nextInt();
		boolean check = false;
		if(k == 1) {
			System.out.println(k + " thuoc day fibonaci");
			System.out.println(k + " thuoc vi tri thu 1, 2");
			return;
		}
		if(ktFibonaci(k)) {
			System.out.println(k + " thuoc day fibonaci");
			System.out.println(k + " thuoc vi tri thu " + sttFibonaci(k));
		}else {
			System.out.println(k + " khong thuoc day fibonaci");
		}
		
	}
	public static void main(String[] args) {
		Bai20 bai20 = new Bai20();
		bai20.resolve();
	}
}
