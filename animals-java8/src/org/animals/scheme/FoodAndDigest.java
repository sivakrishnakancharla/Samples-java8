package org.animals.scheme;

public class FoodAndDigest {

	// eatMode = veg || non-veg
	String eatMode; //Stores the values in StringConstantpool  
	String foodDuration; //Stores the value in heap area

	public String getEatMode() {
		return eatMode;
	}

	public void setEatMode(String eatMode) {
		this.eatMode = eatMode;
	}

	public String getFoodDuration() {
		return foodDuration;
	}

	public void setFoodDuration(String foodDuration) {
		this.foodDuration = new String(foodDuration);
	}

}
