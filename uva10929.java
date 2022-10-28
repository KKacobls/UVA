import java.util.*;
import static java.lang.System.*;
public class main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
    	String a=sc.next();
    	//System.out.print("1a:"+a+"\r\n");
    	if(a.charAt(0)=='0'){
    		return;
    	}
    	int b=0;
    	if(a.length()<12){
    		b=Integer.parseInt(a);
    	}
    	else{
    		for(int i=0 ; i<a.length() ; i++){
    			if(i%2==0){
    				b=b+(a.charAt(i)-48);//a.charAt(i)轉出來是ascii 0的ascii是48 所以-48
    			}
    			else{
    				b=b-(a.charAt(i)-48);
    			}
    		}
    	}
    	b=b%11;//只要b是11倍數就是11倍數
    	//System.out.print("2a:"+a+"\r\n");
    	if(b==0){
    		System.out.print(a+" is a multiple of 11."+"\r\n");
    	}
    	else{
    		System.out.print(a+" is not a multiple of 11."+"\r\n");
    	}
    }
  }
}
