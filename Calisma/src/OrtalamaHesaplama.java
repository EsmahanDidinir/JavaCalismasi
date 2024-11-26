import java.awt.print.Printable;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class OrtalamaHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat,fizik,kimya,tarih;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik Değerini Giriniz:");
		mat=input.nextInt();
		
		System.out.print("Fizik Değerini Giriniz:");
		fizik=input.nextInt();
		
		System.out.print("Kimya Değerini Giriniz:");
		kimya=input.nextInt();
		
		System.out.print("Tarih Değerini Giriniz:");
		tarih=input.nextInt();
		
		int toplam = (mat+fizik+kimya+tarih);
		double ortalama = toplam/4.0;
		
		System.out.println(ortalama);
		
		
		
				

	}

}
