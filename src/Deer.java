
public class Deer implements Animal{
	int eatSum = 0;

	@Override
	public void eat(FoodType food, int calories) {
		if(food == FoodType.PLANTS) {
			eatSum += calories;
		}else {eatSum += 0;}
		
	}

	@Override
	public int requiredCalories() {
		return 1200;
		
	}

	@Override
	public boolean isSated() {
		if (eatSum >= requiredCalories()) {
			return true;
		}else {return false;}
	}
	
}
