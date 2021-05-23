package programs_java;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHM_Prg {

	public static void main(String[] args)
	{
		LinkedHashMap<String, String> lhm= new LinkedHashMap<String, String>();

		lhm.put("A", "One");
		lhm.put("B", "Two");
		lhm.put("C", "Four");
		lhm.put("D", "Four");
        System.out.println("the initial LinkedHashMap lhm is:\n"+lhm+"\n");
        
        lhm.replace("C", "Three");
		System.out.println("After changing value of key 'C', lhm is\n " + lhm+"\n");
		
        System.out.println("Size of the map is : "+ lhm.size());
        System.out.println("Hashcode of map is : " + lhm.hashCode());
        System.out.println("Is lhm empty? "+ lhm.isEmpty());
        System.out.println("Entries: " + lhm.entrySet());
		System.out.println("Keys: " + lhm.keySet());
		System.out.println("Values: " + lhm.values()+"\n");
		
  
        System.out.println("Getting value for key 'A': "+ lhm.get("A"));
        System.out.println("Contains key 'C'?  " + lhm.containsKey("C"));
        System.out.println("Contains value 'Two'?  "+ lhm.containsValue("Two"));
                                
  
        System.out.println("delete element 'B': "+ lhm.remove("B"));
  
        System.out.println("final lhm after removing B from it is:");
		for (Entry<String, String> e : lhm.entrySet())
            System.out.println(e.getKey() + " - "+ e.getValue());
   
	}

}
