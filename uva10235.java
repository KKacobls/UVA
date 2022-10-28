import java.util.*;
public class uva10235{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
    	int a=sc.nextInt();
    	if(a<=3){
    		System.out.print(a+" is prime."+"\r\n");
    	}
    	else{
			tt(a);
    	}
    }
  }
  public static void t(int a){//反轉
  	String b="";
  	b=b+a;
  	String c="";
  	if(b.length()==1){
  		System.out.print(b+" is prime."+"\r\n");//長度1必定一樣
  	}
  	else{
  		for(int i=b.length()-1 ; i>=0 ; i--){
  			c=c+b.charAt(i);
  		}
  		if(c.equals(b)){
  			System.out.print(b+" is prime."+"\r\n");
  		}
  		else{
  			ttt(Integer.parseInt(c),b);
  		}
  	}
  }
  public static void tt(int a){//檢查第一次 是否質數
	for(int i=2 ; i<(a/2)+1 ; i++){
	    if(a%i==0){
	    	System.out.print(a+" is not prime."+"\r\n");
	    	break;//不是質數
	    }
	    if(i==(a/2)){
	   		t(a);//是質數 進行反轉
	    }
	}
  }
  public static void ttt(int a,String b){
	for(int i=2 ; i<(a/2)+1 ; i++){
	    if(a%i==0){
	    	System.out.print(b+" is prime."+"\r\n");
	    	break;//反轉不是質數
	    }
	    if(i==(a/2)){
	   		System.out.print(b+" is emirp."+"\r\n");
	   		//反轉後還是質數
	    }
	}
  }
}
