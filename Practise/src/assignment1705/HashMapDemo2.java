package assignment1705;
import java.util.*;
public class HashMapDemo2 {

	public static void main(String[] args) {
		
		HashMap<String, String> h = new HashMap<>();
		
		h.put("Bablu", "Cuttack");
		h.put("Sachin", "Nimapara");
		h.put("Batulu", "Andhra");
		h.put("Satya", "Nayagada");
		h.put("Amit", "Kendrapara");
		
		System.out.println(h);
		System.out.println("\n Key Sets -> "+h.keySet());
		
		h.put("Biswa", "Rajastan");
		System.out.println("\n After putting new element -> "+h);
		
		System.out.println("\n Key Set -> "+h.keySet());
		System.out.println("\n Values -> "+h.values());
		
		//remove operation
		h.remove("Amit");
		System.out.println("\n After remove ->  "+h);
		
		System.out.println("\n Contains Batula ? "+h.containsKey("Batula"));
		System.out.println("\n keySet -> "+h.keySet());
		System.out.println("\n Values -> "+h.values());
		System.out.println("\n Size -> "+h.size());
		System.out.println("\n Empty? "+h.isEmpty());
		

	}

}
