
public interface Animal {
	public void eat(FoodType food, int calories);
	
	public int requiredCalories();
	
	public boolean isSated();
}
