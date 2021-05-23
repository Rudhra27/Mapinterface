package programs_java;

import java.util.TreeMap;
import java.util.Map.Entry;

public class Treemap_Prg {

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tmap= new TreeMap<Integer, String>();
		tmap.put(1,"Blue");
		tmap.put(2,"Green");
		tmap.put(3,"Pink");
		tmap.put(4,"Orange");
		System.out.println("the initial Treemap tmap is:\n"+tmap+"\n");
        
        tmap.put(4, "Black");
		System.out.println("After changing value of key '4', tmap is\n " + tmap+"\n");
		
        System.out.println("Size of the map is : "+ tmap.size());
        System.out.println("Hashcode of map is : " + tmap.hashCode());
        System.out.println("Is lhm empty? "+ tmap.isEmpty());
        
        System.out.println("Entries: " + tmap.entrySet());
		System.out.println("Keys: " + tmap.keySet());
		System.out.println("Values: " + tmap.values()+"\n");
		
		System.out.println("The first key of tmap is: "+tmap.firstKey());
		System.out.println("The Last key of tmap is:  "+tmap.lastKey()+"\n");
		
		System.out.println("Getting value for key '3': "+ tmap.get(3));
        System.out.println("Contains key '2'?  " + tmap.containsKey(2));
        System.out.println("Contains value 'Pink'?  "+ tmap.containsValue("Pink")+"\n");
        
        System.out.println("The headmap of key 3 is:  "+tmap.headMap(3));
        System.out.println("The Submap of tmap from keys 1 to 3 is:  "+tmap.subMap(1,3)+"\n");
                               
        System.out.println("delete element '3': "+ tmap.remove(3));
        
        System.out.println("final lhm after removing B from it is:");
		for (Entry<Integer, String> e : tmap.entrySet())
            System.out.println(e.getKey() + " - "+ e.getValue());
		
	}

}
