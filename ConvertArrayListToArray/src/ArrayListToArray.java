import java.util.*;
public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("shareef");
		al.add("shaik");
		al.add("orange");
		al.add("banana");
	String array[]=al.toArray(new String[al.size()]);
	
	//another method
	//String array[]=new String[al.size()];
	//for(int i=0;i<al.size();i++) {
		//array[i]=al.get(i);
	//}
	for(String k: array) {
		System.out.println(k);
	}
		

	}

}
