import java.util.*;
public class uva10252t {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	Map<String,Integer>map=new TreeMap<String,Integer>();
        	String s=sc.nextLine();
	        String f=sc.nextLine();
			if(s.equals(" ")&&f.equals(" ")){
				return;
			}
			for(int i=0 ; i<s.length() ; i++){
				map.put(Character.toString(s.charAt(i)),1);
			}//把s的每一個放進map
			for(int i=0 ; i<f.length() ; i++){
				if(map.containsKey(Character.toString(f.charAt(i)))){
					//查看f每一個是否有在map裡面
					map.put(Character.toString(f.charAt(i)),map.get(Character.toString(f.charAt(i)))+1);
					//有的話 把值+1
					i++;
					
				}
			}
			for(String a: map.keySet()){
				if(map.get(a)>=2&&a.charAt(0)!=32){
					System.out.print("要印"+(map.get(a)-1)+"次   ");
					for(int i=1 ;i<map.get(a); i++){
						System.out.print(a);
					}	
				}
			}
			System.out.printf("\r");
			System.out.print("\n");
        }
    }
}
