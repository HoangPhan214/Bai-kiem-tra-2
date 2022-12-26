package Basic.dev;

import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		ranDom(a);
		tinhTong(a);
		demSoNguyenTo(a);
	}
	
	private static void ranDom(int[] a) {
		System.out.println("Mang a");
		Random rd = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(100) + i;
			System.out.print(a[i] + " ");
		}
	}
	
	private static void tinhTong(int[] a) {
		System.out.println();
		int tong = 0;
		for (int i = 0; i < a.length; i++) {
			tong += a[i];
		}
		System.out.println("Tong a[] = " + tong);
	}
	
	static boolean kiemTraSNT(int n) {
		if (n == 1 && n == 2)
			return true;
		if (n % 2 == 0) {
		    	return false;
		    }
		    return true;
		    
	}
	
	private static void demSoNguyenTo(int[] a) {
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (kiemTraSNT(a[i]) == true) {
				dem++;				
			}
			
		}
		System.out.format("Co %d so nguyen to", dem);
	}
}

