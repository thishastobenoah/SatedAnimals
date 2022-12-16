
public class Wolf implements Animal {
	int eatSum = 0;
	int eatCount = 0;
	
	@Override
	public void eat(FoodType food, int calories) {
		if(food == FoodType.MEAT) {
			eatSum += calories;
			eatCount++;
		}else {eatSum += 0;}
		
	}

	@Override
	public int requiredCalories() {
		return 800;
		
	}

	@Override
	public boolean isSated() {
		if (eatSum >= requiredCalories() && eatCount >= 4) {
			return true;
		}else {return false;}
	}

}
