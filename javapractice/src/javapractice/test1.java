package javapractice;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s,i,j;
		for(i=1;i<10;i++){
			for(j=1;j<i+1;j++){
			s=i*j;
			System.out.println(j+"*"+i+"="+s+"\t");
			}
			if(i==j){
				System.out.println();
		}

	}
}
}
