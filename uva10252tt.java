import java.util.*;
public class uva10252 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	String s=sc.nextLine();
	        String f=sc.nextLine();
			if(s.equals(" ")&&f.equals(" ")){
				return;
			}
	        int []sArray=new int [s.length()];
	        int []fArray=new int [f.length()];
	        for(int i=0 ; i<s.length() ; i++){
	        	sArray[i]=s.charAt(i);
	        }
	        for(int i=0 ; i<f.length() ; i++){
	        	fArray[i]=f.charAt(i);
	        }
	        int []Answer;
	        if(f.length()>s.length()){//看哪個長度比較常
	        	Answer=t(sArray,fArray);
	        }
	        else{
	        	Answer=t(fArray,sArray);
	        }
	        for(int i=0 ; i<Answer.length-1 ; i++){//把重複刪掉
	        	for(int k=i+1 ; k<Answer.length ; k++){
	        		if(Answer[i]==Answer[k]){
	        			Answer[k]=0;
	        		}
	        	}
	        }
	        Arrays.sort(Answer);
	        for(int i=0 ; i<Answer.length ; i++){
	        	int b=Answer[i];	
	        	if(b!=0&&b!=32){
		        	char a=(char)b;
		        	System.out.print(a);
	        	}
	        }
	        //System.out.print("\r");
	        System.out.print("\n");
        }

    }
    public static int[] t(int []a,int []b){//a比較小
    	int count=0;
    	int c=0;
    	int []Answer =new int [b.length*b.length];
    	for(int i=0 ; i<a.length ; i++){//小的放外面
    		for(int k=0 ; k<b.length ; k++){
    			System.out.println("i:"+i+" k:"+k);
    			if(a[i]==b[k]){
    				Answer[c]=a[i];
    				c++;
    				coun
    			}
    		}
    	}
    	return Answer;
    }
}
