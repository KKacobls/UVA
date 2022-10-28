import java.util.*;
public class uva12019 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String []day={"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};
		int []mon={31,28,31,30,31,30,31,31,30,31,30};//月份
		int i=sc.nextInt();
		for(i=i ; i!=0 ; i--){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=0;
			for(int k=0 ; k<a-1 ;k++){
				c=c+mon[k];
			}
			c=c+b;
			System.out.println(day[c%7]);
			c=0;
		}
	}
}