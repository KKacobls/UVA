import java.util.*;
import static java.lang.System.*;
public class main{//這題怎麼用腦殘方法還能過 好爽喔
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
    	int n=sc.nextInt();
    	if(n==0){
    		return;
    	}
    	int G=0;
    	for(int i=1 ; i<n ; i++){
    		for(int j=i+1 ; j<=n ; j++){
    			G=G+GCD(i,j);
    		}
    	}
    	System.out.print(G+"\r\n");
    }
  }
  public static int GCD(int a,int b){
  
  	int c=1;//都找不到代表為1
  	for(int i=1 ; i<b ; i++){
  		if(a%i==0){//是a的因數
  			if(b%i==0){//又是b的因數==有可能是最大公因
  				c=i;
  			}
  		}
  	}
  	return c;
  }
}
