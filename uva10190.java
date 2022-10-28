import java.util.*;
import static java.lang.System.*;
public class uva10190{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	if(t(a,b)==1 && a!=0 && b!=0){
    		while(a!=1){
    			System.out.print(a+" ");
    			a=a/b;
    		}
    		System.out.print("1"+"\r\n");
    	}
    	else{
    		System.out.print("Boring!"+"\r\n");
    	}
    }
  }
  public static int t(int a,int b){//檢查A是不是B的任意次方
  	int c=b;//傳0代表不是
  	if(b>a || a==0 || a==1 || b==0|| b==1){
  		return 0;
  	}
  	while(b<=a){
  		if(b==a){
  			return 1;
  		}
  		b=b*c;
  	}
  	return 0;
  }
}
