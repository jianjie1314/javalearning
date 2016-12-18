package javapractice;
import java.util.*;
//import java.awt.List;
//import java.util.Collection;
class test9{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Collection d= new ArrayList();
       Set c= new Hashset();
      /* c.add("1");
       c.add("2");
       c.add("3");*/
	c.add(new student(001,10,"tom1"));
	c.add(new student(002,11,"tom2"));
	c.add(new student(003,12,"tom3"));
	c.add(new student(0044,13,"tom4"));
	for(Object a:c){
	System.out.println(a);}
	//d.addAll(c);
	//System.out.println(d);
	}

}
