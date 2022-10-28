import java.util.*;
import static java.lang.System.*;
public class main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
		int a=sc.nextInt();
		if(a==0){
			return;
		}
        String binaryString = Integer.toBinaryString(a);//把a轉二進制
        int c=0;
        for(int i=0 ; i<binaryString.length() ; i++){
        	if(binaryString.charAt(i)=='1'){
        		c++;//算a二進制有幾個1
        	}
        }
	    System.out.print("The parity of "+binaryString+" is "+c+" (mod 2)."+"\r\n");
	}
  }
}
