import java.util.*;
import static java.lang.System.*;
public class uva10035{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
	    String a=sc.next();
	    String b=sc.next();
	    if(a.charAt(0)==b.charAt(0) && b.charAt(0)=='0'){
	    	return;
	    }
	    int c=a.length()<=b.length() ? b.length() : a.length();
	    int al=a.length()-1;
	    int bl=b.length()-1;
	    int carry=0;
	    int carrytotal=0;
	    for(int e=0 ; e<c ; e++){
	    	if(al>=0){
	    		carry=carry+a.charAt(al)-48;
	    		//System.out.println("carry:"+carry+",a:"+(a.charAt(al)-48));
	    		al--;
	    	}
	    	
	    	if(bl>=0){
	    		carry=carry+b.charAt(bl)-48;
	    		//System.out.println("carry:"+carry+",b:"+(b.charAt(bl)-48));
	    		bl--;
	    	}

	    	if(carry>=10){
	    		carrytotal++;
	    		carry=1;
	    	}
	    	else{
	    		carry=0;
	    	}
	    }
	    if(carrytotal==0){
	    	System.out.print("No carry operation."+"\r\n");
	    }
	    else if(carrytotal==1){
	    	System.out.print(carrytotal+" carry operation."+"\r\n");
	    }
	    else{
	    	System.out.print(carrytotal+" carry operations."+"\r\n");
	    }
	    
    }
  }
}
