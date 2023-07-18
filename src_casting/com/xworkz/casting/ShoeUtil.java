package com.xworkz.casting;

public class ShoeUtil {
	
	static void buy(Shoe shoe) {
		
		if(shoe != null) {
			
			System.out.println("price :"+shoe.price);
			System.out.println("size :"+shoe.size);
			System.out.println("color :"+shoe.color);
			
			if(shoe instanceof PumaShoe) {
				
				PumaShoe pumaShoe = (PumaShoe)shoe;
				System.out.println("Creating casting of PumaShoe..");
			
				
			}
			else {
				System.err.println("Invalid..");
				
			}
			
			if(shoe instanceof NikeShoe)  {
				NikeShoe nikeShoe = (NikeShoe)shoe;
				System.out.println("Creating casting of NikeShoe..");
				
			}
			
			else {
				System.err.println("Invalid..");
				
			}
			
		}
	}

}
