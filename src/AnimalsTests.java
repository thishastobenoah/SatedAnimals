import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalsTests {

	@Test
	void testDeer() {
		Deer deer1 = new Deer();
		deer1.eat(FoodType.PLANTS, 300);
		deer1.eat(FoodType.PLANTS, 300);
		assertEquals(false, deer1.isSated());
		
	}
	@Test
	void testBush() {
		Bush bush1 = new Bush();
		bush1.eat(FoodType.LIGHT, 600);
		bush1.eat(FoodType.LIGHT, 600);
		assertEquals(true, bush1.isSated());
		
	}
	@Test
	void testPig() {
		Pig pig1 = new Pig();
		pig1.eat(FoodType.PLANTS, 2400);
		pig1.eat(FoodType.MEAT, 600);
		assertEquals(false, pig1.isSated());
		
	}
	@Test
	void testPig2() {
		Pig pig1 = new Pig();
		pig1.eat(FoodType.PLANTS, 2400);
		pig1.eat(FoodType.MEAT, 2400);
		assertEquals(true, pig1.isSated());
		
	}
	@Test
	void testChimp() {
		Chimp chimp1 = new Chimp();
		chimp1.eat(FoodType.PLANTS, 800);
		chimp1.eat(FoodType.MEAT, 200);
		assertEquals(true, chimp1.isSated());
		
	}
	@Test
	void testPanda() {
		Panda panda1 = new Panda();
		panda1.eat(FoodType.PLANTS, 5500);
		panda1.eat(FoodType.MEAT, 20000);
		assertEquals(false, panda1.isSated());
		
	}
	@Test
	void testWolf() {
		Wolf wolf1 = new Wolf();
		wolf1.eat(FoodType.PLANTS, 5500);
		wolf1.eat(FoodType.MEAT, 800);
		assertEquals(false, wolf1.isSated());
		
	}
	@Test
	void testWolf2() {
		Wolf wolf1 = new Wolf();
		wolf1.eat(FoodType.PLANTS, 5500);
		wolf1.eat(FoodType.MEAT, 200);
		wolf1.eat(FoodType.MEAT, 200);
		wolf1.eat(FoodType.MEAT, 200);
		wolf1.eat(FoodType.MEAT, 200);
		assertEquals(true, wolf1.isSated());
		
	}

}
