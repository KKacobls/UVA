import java.util.*;
import static java.lang.System.*;
public class true_uva10093{
  public static void main(String[] args) {
  	Scanner sc=new Scanner(System.in);
  	//a=97,z=122,A=65,Z=90,+-=43,45,'0'=48,'9'=57
  	while(sc.hasNext()){
	  	String a=sc.next();
	  	int total=0;
	  	int max=1;
	  	for(int i=0 ; i<a.length() ; i++){
	  		int c=0;
	  		if(a.charAt(i)==43 || a.charAt(i)==45){
	  			total=total;//+-不算
	  		}
	  		else if(a.charAt(i)>=97 && a.charAt(i)<=122){
	  			total=total+a.charAt(i)-61;
	  			c=a.charAt(i)-61;
	  		}
	  		else if(a.charAt(i)>=65 && a.charAt(i)<=90){
	  			total=total+a.charAt(i)-55;
	  			c=a.charAt(i)-55;
	  		}
	  		else if(a.charAt(i)>=48 && a.charAt(i)<=57){
	  			total=total+a.charAt(i)-48;
	  			c=a.charAt(i)-48;
	  		}
	  		max = max<c ? c : max;
	  	}
		//System.out.print("t:"+total+"\r\n");
	  	if(total==1 || total==0){
	  		System.out.print("2"+"\r\n");
	  	}
	  	else if(total<10 && total>1){
	  		System.out.print((total+1)+"\r\n");
	  	}
	  	else{
			for(int i=max ; i<63 ; i++){
				//System.out.println(total+" % "+i+" = "+(total%i));
				if(total%i==0){
					System.out.print((i+1)+"\r\n");
					break;
				}
				if(i==62){
					System.out.print("such number is impossible!"+"\r\n");
					break;
				}
			}
		}
	}
  }
}
