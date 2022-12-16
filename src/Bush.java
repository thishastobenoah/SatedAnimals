
public class Bush implements Animal{
	int eatSum = 0;
	
	@Override
	public void eat(FoodType food, int calories) {
		if(food == FoodType.LIGHT) {
			eatSum += calories;
		}else {eatSum += 0;}
		
	}

	@Override
	public int requiredCalories() {
		return 50;
	}

	@Override
	public boolean isSated() {
		if (eatSum >= requiredCalories()) {
			return true;
		}else {return false;}
	}

}
