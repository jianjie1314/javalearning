package javapractice;

public class learingcook implements cook{
public void fee(double a){
	if(a==1000)
		System.out.println("初级厨师"+a);
	else if(a==2000)
		System.out.println("中级厨师"+a);
	else if(a==3000)
		System.out.println("高级厨师"+a);
	else
		System.out.println("没有厨师");
	
}
public static void way(String  b){
	if(b=="初级厨师")
		System.out.println("可以学蛋炒饭");
	else if(b=="中级厨师")
		System.out.println("可以学蛋炒饭和鱼香肉丝");
	else if(b=="高级厨师")
		System.out.print("可以学任何菜");
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		learingcook a=new learingcook();
		a.fee(1000);
		a.way("初级厨师");

	}

}
