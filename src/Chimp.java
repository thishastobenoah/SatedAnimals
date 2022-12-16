
public class Chimp implements Animal{
	int eatSum = 0;
	int meatSum = 0;
	@Override
	public void eat(FoodType food, int calories) {
		if(food == FoodType.LIGHT) {
			eatSum += 0;
		}else {eatSum += calories;}
		if (food == FoodType.MEAT) {
			meatSum += calories;
		}
		
	}

	@Override
	public int requiredCalories() {
		return 1000;
		
	}

	@Override
	public boolean isSated() {
		if (eatSum >= requiredCalories() && meatSum >= requiredMeat()) {
			return true;
		}else {return false;}
	}
	public int requiredMeat() {
		return 200;
	}

}
