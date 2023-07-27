package com.xworkz.equals.app;

public class Assets {
	private String type;
	private float reviewStars;
	private boolean isItBenefit;
	
	@Override
	public String toString() {
		System.out.println("invoking toString in Assets..");
		return "type "+this.type+" reviewStars "+this.reviewStars+" isItBenefit "+this.isItBenefit;
		
	}
	
	public Assets() {
		
	}

	public Assets(String type, float reviewStars, boolean isItBenefit) {
		super();
		this.type = type;
		this.reviewStars = reviewStars;
		this.isItBenefit = isItBenefit;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			System.out.println("without null can aompare");
			if(obj instanceof Assets) {
				System.out.println(this);
				System.out.println(obj);
				Assets assets = (Assets)obj;
				if(this.type == assets.type && this.reviewStars == assets.reviewStars && this.isItBenefit == assets.isItBenefit) {
					System.out.println("Both data are same");
					return true;
				}
				else {
					System.err.println("Both data are not are same");
				}
			}
			
		}
		else {
			
		}
		return false;
	}
	

}
