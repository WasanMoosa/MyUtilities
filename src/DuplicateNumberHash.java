import java.util.HashMap;
import java.util.Map;


public class DuplicateNumberHash {
static 	HashMap<Integer, Integer> number= new HashMap<>();
static int[] array = {101,88,3,65,6,3,0,0,88,88 };
	public static void main(String[] args) {
	
		
		number=getHash(array);
		
		for(Integer currentkey:number.keySet()){
			if (number.get(currentkey) !=1) {
		System.out.println(currentkey+ " appears " + number.get(currentkey)+ " times");
	}}
			
}
	static HashMap <Integer, Integer> getHash (int arr[]){
		int index=1;
		for (int i=0; i<array.length; i++) {
			if (number.get(array[i])==null) {
			number.put(array[i], index);
		}
			else {
				number.put(array[i], number.get(array[i])+1);
			}

	}
		return number;
		
	}
	
}