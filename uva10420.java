import java.util.*;
public class uva10420 {
  public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String e="";
	    String s[]=new String [n];
	    int c=0;
	    while(sc.hasNext()){
	        e=sc.nextLine();
	        String a[]=e.split(" ");
	        //System.out.print("a[0] "+a[0]+"\r\n");
	        if(c!=0){s[s.length-n--]=a[0];}
	        //System.out.print("s["+(s.length-n+1)+"]:"+s[(s.length-n+1)]+"\r\n");
	        c++;
	    }
	    n=1;
	    Arrays.sort(s);
	    for(int i=0 ; i<=s.length-1 ; i++){
	        if(i!=s.length-1){
	            if(t(s[i],s[i+1])){
	                n++;
	            }
	            else{
	                System.out.print(s[i]+" "+n+"\r\n");
	                n=1;
	            }    
	        }
	        if(i==s.length-1){
	            System.out.print(s[i]+" "+n+"\r\n");
	        }
	    }
	  }
	  public static boolean t(String s,String e){
	      int count=0;
	      if(s.length()==e.length()){
	          for(int i=0 ; i<s.length() ; i++){
	              if(s.charAt(i)==e.charAt(i)){
	                   count++;
	              }
	              else{
	                  return false;
	              }
	          }
	      }
	      else{
	          return false;
	      }
	      if(count==s.length()){
	          return true;
	      }
	      return false;
	}
	//下面是比較爛的equals  因為我常常會拼錯一兩字==
    public static void t(){//以前寫的 用map作弊XD
	    	Scanner sc=new Scanner(System.in);
        Map<String,Integer > map = new TreeMap<String , Integer>();
		String country[]=new String [20000];
		int count=0;
		int c=0;
        String a="";
		int n=sc.nextInt();
		for(int i=0 ; i<n ; i++){
			while(a.equals("")){
				a=sc.nextLine();
			}
			String[] split = a.split(" ");
			if(map.containsKey(split[0])){//有的話
				map.put(split[0],(map.getOrDefault(split[0], 0)+1));
				//放入國家,國家人數+1
			}
			else{//沒有的話
				map.put(split[0], 1);
				country[c++]=split[0];
				count++;
				//建立國家,國家人數=1
			}
			a="";
		}

		for(String e:map.keySet())
		{
			System.out.println(e+" "+map.get(e));
			
		}
    }
}