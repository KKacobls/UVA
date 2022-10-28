import java.util.*;
public class uva10222 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String>map=new HashMap();
        map.put("e","q");map.put("d","a");map.put("c","z");
		map.put("r","w");map.put("f","s");map.put("v","x");
		map.put("t","e");map.put("g","d");map.put("b","c");
		map.put("y","r");map.put("h","f");map.put("n","v");
		map.put("u","t");map.put("j","g");map.put("m","b");
		map.put("i","y");map.put("k","h");map.put(",","n");
		map.put("o","u");map.put("l","j");map.put(".","m");
		map.put("p","i");map.put(";","k");map.put("/",",");
		map.put("[","o");map.put("'","l");map.put("]","p");
		while(sc.hasNextLine()){
			String t=sc.nextLine();
			for(int i=0 ; i<t.length() ; i++){
				char b=t.charAt(i);//65~81>97~
				int d=(int)b;//k[r dyt I[o
				//System.out.print("d:"+d);
				if(d<91 && d>=65){
					d=(int)(b+32);
					b=(char)(d);
				}
				//System.out.println(",d:"+d);
				String a=Character.toString(b);
				if(map.containsKey(a)){
					System.out.print(map.get(a));
				}
				else{
					System.out.print(b);
				}
			}
			System.out.print("\r");
			System.out.print("\n");
		}
    }
}
