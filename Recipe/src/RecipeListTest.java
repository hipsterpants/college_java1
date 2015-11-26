import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class RecipeListTest {
	
	RecipeList testObject = new RecipeList();
	public String userSearch;
	private ArrayList<String> searchQueryArray;
	private ArrayList<String> resultArray;
	private int numberRecipes;
	private ArrayList<Recipe> recipeList;
	public ArrayList<String> ingredientNameArray;
	public String recipeName;

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecipeToArray() {
		//assertEquals("testObject2", testObject.recipeToArray());
	}

	@Test
	public void testSearchQuery() {
		String testString = "Orange";
		assertEquals("Orange", testObject.searchQuery(testString));
	}

	@Test
	public void testSearchToInstance() {
		String testString = "Orange";
		assertEquals("Orange", testObject.searchQuery(testString));
	}

	@Test
	public void testSearchDivision() {
		userSearch = "Cheese";
		assertEquals("Cheese", testObject.searchDivision());
	}

	@Test
	public void testSearch() {
		searchQueryArray.add("Cheese");
		ingredientNameArray.add("Cheese");
		recipeName = "Cheese Pie";
		assertEquals("Cheese Pie", testObject.search());
	}

	@Test
	public void testCountResult() {
		resultArray.add("Cake");
		resultArray.add("Lollipop");
		assertEquals("2", testObject.countResult());
	}

	@Test
	public void testOutputResult1() {

	}
	@Test
	public void testOutputResult2() {
	
	}

}
