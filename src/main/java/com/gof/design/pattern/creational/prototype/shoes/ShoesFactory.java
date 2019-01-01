package com.gof.design.pattern.creational.prototype.shoes;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ShoesFactory {
	
	private static Map<String, Object> prototypes = new HashMap<String, Object>();
	
	static {
		prototypes.put("Sports",new SportsShoes());
		prototypes.put("Formal",new FormalShoes());
		prototypes.put("Casual",new CasualShoes());
		
	}
	
	public static Shoes makeObject(String shoesType){
		 Shoes shoes = (Shoes)prototypes.get(shoesType);
	        //deep cloning (using in-memory)
	        try {
	            Shoes deepClonedShoes = (Shoes) shoes.deepCloning();
	            System.out.println("Deep-Cloned Shoes ========== "+deepClonedShoes);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
		
	        //Shallow cloning
	        Shoes shallowClonedShoes = null;
	        try {
	            shallowClonedShoes = (Shoes) shoes.shallowCloning();
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Shallow-Cloned Shoes ========== " +shallowClonedShoes );
	        return shallowClonedShoes;
		}

}