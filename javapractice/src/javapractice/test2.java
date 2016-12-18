package javapractice;
import java.util.*;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c,i,j;
		String d,m = null;
		Scanner sc=new Scanner(System.in);
		String a[] = new String[7];
		String b[] = new String[a.length];
    	for (i = 0; i < 7; i++) {
    		a[i] = (i + 1) + "";
    		System.out.print(a[i]);
    		if (i != (a.length - 1))
    			System.out.print(",");
    	}
		System.out.print("请输入要插入的位置");
		c=sc.nextInt();
		System.out.print("请输入要插入的数");
		d=sc.next();
    	for (j = 0; j < a.length+1; j++) {
    		if(c==j)
    			m=a[i];
    			a[i]=d;
    			a[i+1]=m;
    		//a[i+1] =a[i];
    		b[i-1]=a[i];
    		System.out.print(b[i]);
    		if (i != (b.length - 1))
    			System.out.print(",");
    	}
	}
    	}
