import java.util.*;
import static java.lang.System.*;
public class uva10008{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Map <String,Integer>map=new TreeMap<String ,Integer>();
    Map <String,Integer>maps=new HashMap<String ,Integer>();
    //先輸入數字nextInt();
    //每行輸入文字 每次都加起來
    //建立map把中間英文刮起來
    //用hashMap列出來
    int count=0;
    String a;
    for(int i=65 ; i<91 ;i++){
    //數字轉ascii(String)
    	a=Character.toString(i);
    	map.put(a,i);
    }
    for(int i=97 ; i<123 ;i++){
    //數字轉ascii(String)
    	a=Character.toString(i);
    	map.put(a,i);
    }
    //System.out.println(map.entrySet());

    String b="";
    int n=sc.nextInt();
    
    for(int i=0 ; i<n+1 ;i++){
    	a=sc.nextLine();
    	//System.out.print("第"+i+"次: "+a);
    	b=b+a;
    }
    
    a="";
    String c="";
    for(int i=0 ; i<b.length() ;i++){
    	c=Character.toString(b.charAt(i));
    	if(map.containsKey(c)){
    		n= b.charAt(i)>95 ? b.charAt(i)-32 : b.charAt(i);
    		//System.out.println("數字是:"+n);
    		c=Character.toString(n);
    		a=a+c;
    	}
    }
    System.out.print("\n"+a+"\n\n");
    for(int i=0 ; i<a.length() ; i++){
    	if(maps.containsKey(Character.toString(a.charAt(i)))){
    		maps.put(Character.toString(a.charAt(i)),maps.get(Character.toString(a.charAt(i)))+1);
    		//找到值就++;
    	}
    	else{
    		maps.put(Character.toString(a.charAt(i)),1);
    	}
    }
    for(String e :maps.keySet()){
    	//System.out.println(e+" "+maps.get(e));
    	count++;
    }//maps
    int Answerint[]=new int [count];
    String Answerstring[]=new String [count];
    int h=0;
    //Map to array
    for(String e :maps.keySet()){
    	Answerint[h]=maps.get(e);
    	Answerstring[h++]=e;
    }
    for(int i=0 ; i<count ; i++){
    	//System.out.println(Answerstring[i]+" "+Answerint[i]);
    }
    //System.out.println("比對--------------------------------------------");
    b="";
    int d=0;
    for(int i=0 ; i<Answerint.length-1 ; i++){
    	for(int k=i+1 ; k<Answerint.length ; k++){
    		//System.out.println(Answerint[i]+"比對"+Answerint[k]);
    		if(Answerint[i]<Answerint[k]){
    			d=Answerint[i];
    			Answerint[i]=Answerint[k];
    			Answerint[k]=d;
    			b=Answerstring[i];
    			Answerstring[i]=Answerstring[k];
    			Answerstring[k]=b;
    		}
    		if(Answerint[i]==Answerint[k]){
				int aa1=Answerstring[i].charAt(0);
				int bb1=Answerstring[k].charAt(0);
				if(bb1<aa1){
					d=Answerint[i];
	    			Answerint[i]=Answerint[k];
	    			Answerint[k]=d;
	    			b=Answerstring[i];
	    			Answerstring[i]=Answerstring[k];
	    			Answerstring[k]=b;
				}
    			//n= b.charAt(i)>95 ? b.charAt(i)-32 : b.charAt(i);
    		}
    	}
    	d=0;
    	b="";
    }
    for(int i=0 ; i<Answerint.length ; i++){
    	System.out.println(Answerstring[i]+" "+Answerint[i]);
    }
  }
};
