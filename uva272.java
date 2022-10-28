import java.util.*;
public class uva272 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        while(sc.hasNext()){
        	String a=sc.nextLine();
        	String b="";
        	for(int i=0 ; i<a.length() ;i++){
        		if(a.charAt(i)=='"'&&c==0){
        			b=b+"``";
        			c++;
        		}
        		else if(a.charAt(i)=='"'&&c==1){
        			b=b+"''";
        			c=0;
        		}
        		else{
        			b=b+a.charAt(i);
        		}
        	}
        	System.out.println(b);
        }
    }
}