package com.nang;

public class DiscountRate {
	static double serviceDiscountPlatinum=0.2;
	 static double serviceDiscountGold=0.15;
	 static double serviceDiscountSilver=0.1;
	 static double productDiscountPremium=0.1;
	 static double productDiscountGold=0.1;
	 static double productDiscoutnSilver=0.1;
	 static double getServiceDiscountRate(String mType) {
		 if(mType=="platinum") {
			 return serviceDiscountPlatinum;
		 }
		 else if(mType=="Gold") {
			 return serviceDiscountGold;
		 }
		 else {
			 return serviceDiscountSilver;
		 }
		 
	 }
	 static double getProductDiscountRate(String mType) {
		 if(mType=="platinum") {
			 return serviceDiscountPlatinum;
		 }
		 else if(mType=="Gold") {
			 return serviceDiscountGold;
		 }
		 else {
			 return serviceDiscountSilver;
		 }
}
}
