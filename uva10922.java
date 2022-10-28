import java.util.*;
public class uva10922{
static int count=1;
static int c=0;
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   	while(sc.hasNext()){
   		String a=sc.next();
   		if(a.charAt(0)=='0'){//0就關掉
   			return;
   		}
   		if(a.length()>=2){
   		count--;//大於10以上 如果最後算到9 會多加 所以先減
   		}
   		t(a);
   		if(c==0){
   			System.out.print(a+" is not a multiple of 9."+"\r\n");
   		}
   		else{
   			System.out.print(a+" is a multiple of 9 and has 9-degree "+count+"."+"\r\n");
   		}
   		count=1;
   		c=0;
   	}
  }
  public static void t(String a){
  	int total=0;
  	for(int i=0 ; i<a.length() ; i++){//每個數字加總
  		total=total+(a.charAt(i)-48);
  	}
  	if(total%9==0){
  		if(a.length()>=2){
			count++;
	  		a="";
	  		a=a+total;
	  		t(a);
  		}
  		if(c==0){
  			c=1;
  		}
  		//System.out.print("a:"+a+"count:"+count+"\r\n");

  	}
  }
}
