package chuong1;

import java.util.Scanner;

public class Bai13 {
	
	public static int UCLN(int a, int b) {
		   if(a == 0 || b == 0){
		      return a + b;
		   }
		   while(a != b){
		      if(a > b){
		         a = a - b; 
		      }
		      else{
		         b = b - a; 
		      }
		   }
		   return a; // b 
	}
	
	public static int BCNN(int a, int b) {
		return a*b / UCLN(a,b);
	}
	
	public static void resolve() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a: ");
		boolean check = false;
		int a;
		do {
			if(check) {
				System.out.println("Nhap a >= 0");
				System.out.print("Nhap lai a: ");
			}
			check = true;
			a = scanner.nextInt();
		}while(a < 0);
		System.out.print("Nhap b: ");
		check = false;
		int b;
		do {
			if(check) {
				System.out.println("Nhap b > 0");
				System.out.print("Nhap lai b: ");
			}
			b = scanner.nextInt();
		}while(b <= 0);
		System.out.println("UCLN: " + UCLN(a,b));
		System.out.println("BCNN: " + BCNN(a,b));
	}
	
	public static void main(String[] args) {
		Bai13 bai13 = new Bai13();
		bai13.resolve();
	}
}
