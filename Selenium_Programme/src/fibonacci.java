
public class fibonacci {
	public static void main(String[] args) {

		int count=10;
        int a=0,b=1;
        System.out.print(a+" "+b);
        for(int i=2;i<=count;i++) {
        	int c=a+b;
        	System.out.print(" "+c);
        	a=b;
        	b=c;
        }

}
}
