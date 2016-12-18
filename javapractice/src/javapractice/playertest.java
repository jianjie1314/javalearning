package javapractice;

import java.util.Scanner;

public class playertest {

	//private static char[] in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		sc=new Scanner(System.in);
		double i=sc.nextDouble();
		player a=null;
		if(150<=i&&i<200){
			a=new football();
			a.ball();}
		else if(i>=200){
			a=new basketball();
		a.ball();}
		else{
			a=new glasser();
		a.ball();}

}
}
