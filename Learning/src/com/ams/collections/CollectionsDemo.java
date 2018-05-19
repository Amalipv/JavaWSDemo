package com.ams.collections;
import java.util.*;
public class CollectionsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		HashMap hm = new HashMap();
		hm.put("a","apple");
		hm.put("b", "balloon");
		hm.put("c", "cat");
		hm.put("c", "chennai");
		hm.put("", "");
		System.out.println(hm);
		Hashtable ht = new Hashtable();
		ht.put(hm, ht);
		System.out.println(ht.containsKey(hm));
		System.out.println(ht);
		ht.put(ht, ht);
		System.out.println(ht);
		HashSet hs = new HashSet();
		hs.add("h");
		hs.add("g");
		hs.add("h");
		ht.put("hashmap",hs);
		System.out.println(ht);
		System.out.println(hs);
	}
	
}
