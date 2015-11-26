import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;


public class RecipeTest {
	
	Recipe testObject = new Recipe();

	@Test
	public void testGetRecipe() {
		fail("Not yet implemented");
	}

	@Test
	public void testInputRecipe() {
		String testString = "Giant Bread";
		assertEquals("Giant Bread", testObject.inputRecipe(testString));
	}

	@Test
	public void testRecipeToInstance() {
		String testString = "Giant Bread";
		assertEquals("Giant Bread", testObject.inputRecipe(testString));
	}

	@Test
	public void testGetIngredient() {
		ArrayList<String> testArrayList = new ArrayList<String>();
		testArrayList.add("Flour");
		testArrayList.add("Water");
		assertEquals("Flour", testObject.getIngredient(testArrayList).get(0));
		assertEquals("Water", testObject.getIngredient(testArrayList).get(1));
		
	}

	@Test
	public void testIngredientToInstance() {
		ArrayList<String> testArrayList = new ArrayList<String>();
		testArrayList.add("Flour");
		testArrayList.add("Water");
		assertEquals("Flour", testObject.getIngredient(testArrayList).get(0));
		assertEquals("Water", testObject.getIngredient(testArrayList).get(1));
	}

	@Test
	public void testGetIngredientAmount() {
		ArrayList<Double> testArrayList = new ArrayList<Double>();
		testArrayList.add(3.5);
		testArrayList.add(4.23);
		assertEquals("3.5", testObject.getIngredientAmount(testArrayList).get(0));
		assertEquals("4.23", testObject.getIngredientAmount(testArrayList).get(0));
	}

	@Test
	public void testAmountToInstance() {
		ArrayList<Double> testArrayList = new ArrayList<Double>();
		testArrayList.add(3.5);
		testArrayList.add(4.23);
		assertEquals("3.5", testObject.getIngredientAmount(testArrayList).get(0));
		assertEquals("4.23", testObject.getIngredientAmount(testArrayList).get(1));
	}

	@Test
	public void testGetUnitType() {
		ArrayList<String> testArrayList = new ArrayList<String>();
		testArrayList.add("Cups");
		testArrayList.add("Giant Spoons");
		assertEquals("Cups", testObject.getUnitType(testArrayList).get(0));
		assertEquals("Giant Spoons", testObject.getUnitType(testArrayList).get(1));
	}

	@Test
	public void testUnitToInstance() {
		ArrayList<String> testArrayList = new ArrayList<String>();
		testArrayList.add("Cups");
		testArrayList.add("Giant Spoons");
		assertEquals("Cups", testObject.getUnitType(testArrayList).get(0));
		assertEquals("Giant Spoons", testObject.getUnitType(testArrayList).get(1));
	}

}
