package programs_java;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap_Prg {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> hm1 = new HashMap<>();
		hm1.put("A", 1);
		hm1.put("B", 2);
		hm1.put("C", 4);
		hm1.put("D", 4);
		System.out.println("Initial Map of hm1 is\n " + hm1+"\n");
		System.out.println("Size of map hm1 is: " + hm1.size());
		System.out.println("Hashcode of map hm1 is: " + hm1.hashCode());
		
		hm1.put("C", 3);
		System.out.println("After changing value of key 'C', hm1 is\n " + hm1+"\n");
		
		System.out.println("Entries: " + hm1.entrySet());
		System.out.println("Keys: " + hm1.keySet());
		System.out.println("Values: " + hm1.values()+"\n");
		
		if (hm1.containsKey("C")) {
            Integer a = hm1.get("C");
            System.out.println("value for key" + " \"C\" is: " + a);
        }
		
		if (hm1.containsValue(3)) {
            System.out.println("Value 3 is present in hm1"+"\n");
        }      
		
		hm1.remove("B");
		System.out.println("final hm1 after removing B from it is:");
		for (Entry<String, Integer> e : hm1.entrySet())
            System.out.println(e.getKey() + " - "+ e.getValue());
   
		
	}

}
