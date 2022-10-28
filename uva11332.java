import java.util.*;
public class uva11332 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int i=1;
        while(sc.hasNextLine()){
	        String s=sc.nextLine();
	        while(s.equals("")){
	        	s=sc.nextLine();
	        }
	        //System.out.println("²Ä"+i+"¦¸:"+s);
	        t(s);
	        //i++;
        }
    }
    public static void t(String s){
    	int b=0;
    	if(s.length()>=2){
    		for(int i=0 ; i<s.length() ; i++ ){
    			char a=s.charAt(i);
    			b=Character.getNumericValue(a)+b;
    		}
    		String c=String.valueOf(b);
    		t(c);
    	}
    	else{
    		if(s.equals("0")){
    			
    		}
    		else{
    			System.out.println(s);
    		}
    	}
    }
}
