package chuong1;

import java.util.Scanner;

public class Bai18 {
	
	public static boolean ktSHH(int m) {
		int count = 0;
		for(int i = 1; i < m; ++i) {
			if(m%i == 0) {
				++count;
			}
		}
		int arr[] = new int[count];
		int dem = 0;
		for(int i = 1; i < m; ++i) {
			if(m%i == 0) {
				arr[dem] = i;
				++dem;
			}
		}
		int sum = 0;
		for(int i = 0; i < count; ++i) {
			sum = sum + arr[i];
		}
		if(sum == m) {
			return true;
		}
		return false;
	}
	
	public static void resolve() {
		Scanner scanner = new Scanner(System.in);
		int n = 1000;
		System.out.print("Day so hoan hao nho hon " + n + " la: ");
		for(int i = 2; i < n; ++i) {
			if(ktSHH(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Bai18 bai18 = new Bai18();
		bai18.resolve();
	}
}
