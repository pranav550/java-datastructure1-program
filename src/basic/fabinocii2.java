package basic;

public class fabinocii2 {
	static int n1=0,n2=1,n3=0;
	static void printfab(int count) {
		if(count>0) {
			   n3 = n1 + n2;    
		         n1 = n2;    
		         n2 = n3;    
		         System.out.print(" "+n3);
		         printfab(count-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=10;
		  System.out.print(n1+" "+n2);//printing 0 and 1    
        printfab(count-2);
	}

}
