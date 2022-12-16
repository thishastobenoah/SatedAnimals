
public class Panda implements Animal {
	int eatSum = 0;
	
	@Override
	public void eat(FoodType food, int calories) {
		if(food == FoodType.PLANTS) {
			eatSum += (calories / 2);
		}else {eatSum += 0;}
		
	}

	@Override
	public int requiredCalories() {
		return 3000;
		
	}

	@Override
	public boolean isSated() {
		if (eatSum >= requiredCalories()) {
			return true;
		}else {return false;}
	}

}
