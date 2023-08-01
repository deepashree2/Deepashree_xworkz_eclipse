package com.xworkz.abstsraction.run;

import com.xworkz.abstraction.app.Fashion;
import com.xworkz.abstraction.app.Poomex;
import com.xworkz.abstraction.app.Puma;

public class FashionRunner {

	public static void main(String[] args) {
		
		Fashion puma = new Puma();
		puma.durability();
		puma.price();
		System.out.println(puma.isthisTraditional());
		puma.brandAmssdor();
		
		Fashion poomex = new Poomex();
		poomex.durability();
		poomex.price();
		System.out.println(poomex.isthisTraditional());
		poomex.brandAmssdor();
	}

}
