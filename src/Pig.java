
public class Pig implements Animal{
	int plantSum = 0;
	int meatSum = 0;
	int eatSum = 0;
	
	@Override
	public void eat(FoodType food, int calories) {
		if(food == FoodType.LIGHT) {
			eatSum += 0;
		}else {eatSum += calories;}
		if (food == FoodType.PLANTS) {
			plantSum += calories;
		}else {meatSum += calories;}
		
	}

	@Override
	public int requiredCalories() {
		return 3000;
	}

	@Override
	public boolean isSated() {
		if (eatSum >= requiredCalories() && meatSum >= requiredMeat() && plantSum >= requiredPlants()) {
			return true;
		}else {return false;}
	}
	public int requiredMeat() {
		return 1000;
	}
	public int requiredPlants() {
		return 1000;
	}

}
