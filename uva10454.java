import java.util.*;
import static java.lang.System.*;
public class main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=0 ; i<a ;i++){
	    int b=sc.nextInt();
		int c=sc.nextInt();
		if((b+c)%2==1 || c>b){
			System.out.println("impossible");
		}
		else{
			for(int k=1 ; k<b ; k++){
				if((b+c)==(2*k)){
					System.out.print(k);
					System.out.println(" "+(k-c));
				}
			}
		}
    }

  }
}
