import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Sean McDonald
 * Date: 3/28/14
 * Class: CS 181 MWF 12:30pm
 * Assignment 5
 * 
 * The purpose of this class is to get the input information from the Recipe class and then allow the user to search
 * for recipes based on ingredients.
 * 
 * userSearch - The search input by the user
 * searchQueryArray - The array of search inputs if the user input multiple at a time
 * resultArray - The array of recipes found from ingredient searches.
 * numberRecipes - The number of the recipes found
 * recipeList - The array of Recipe class objects.
 *
 */
public class RecipeList extends Recipe
{
	private String userSearch;
	private ArrayList<String> searchQueryArray;
	private ArrayList<String> resultArray;
	private int numberRecipes;
	private ArrayList<Recipe> recipeList;
	
	RecipeList instantiateRecipe2 = new RecipeList();
	
/**
 * The purpose of this main method is to get the information from the Recipe class and then use various methods to search
 * through all of the stored recipes and ingredients to return the information to the user.
 * 
 * @param args The input from the user.
 */
	public void main(String[] args)
	{
		String searchInput = "";
		instantiateRecipe2.recipeToArray();
		for (int j = 0; j < recipeList.size(); j++)
		{
			instantiateRecipe2.recipeList.get(j);
			instantiateRecipe2.searchQuery(searchInput);
			instantiateRecipe2.searchToInstance(searchInput);
			instantiateRecipe2.searchDivision();
			instantiateRecipe2.search();
			instantiateRecipe2.countResult();
			instantiateRecipe2.outputResult1();
			instantiateRecipe2.outputResult2();
		}
	}
/**
 * The purpose of this method is to get all of the Recipes entered and put them into their own array list.
 * 
 * @return The array of recipes.
 */
public ArrayList<Recipe> recipeToArray()
{
	while (!recipeName.equals("none"))
	{
		recipeList.add(getRecipe());	
	}
	return recipeList;
}
	
/**
 * The purpose of this method is to have the user input their search query and store it in a variable.
 * 
 * @param searchInput The search input by the user stored in a variable.
 * @return The searchInput variable now containing the search entered by the user.
 */
public String searchQuery(String searchInput)
{
	Scanner in = new Scanner(System.in);
	System.out.print("Input ingredient list ('done' to stop): ");
	searchInput = in.next();
	return searchInput;
}
/**
 * The purpose of this method is to store the data from searchInput into userSearch.
 * 
 * @param searchInput The search entered by the user.
 * @return The instance variable now containing the search entered by the user.
 */
public String searchToInstance(String searchInput)
{
	userSearch = searchInput;
	return userSearch;
}

/**
 * The purpose of this method is to divide the search up into multiple parts if such is entered by the user and store
 * them in an array list.
 * 
 * @return The array list of search terms to be used in other methods.
 */
public ArrayList<String> searchDivision()
{
	int i = 0;
	String tempSearchInput = "";
	String tempSearchInput2 = "";
	while (userSearch.charAt(i) != (','))//need to fix, only works for two ingredient search
	{
		i++;
	}
	tempSearchInput = userSearch.substring(0, i);
	tempSearchInput2 = userSearch.substring(i + 1);
	searchQueryArray.add(tempSearchInput);
	searchQueryArray.add(tempSearchInput2);
	return searchQueryArray;
}
/**
 * The purpose of this method is to use the search terms to search each recipe, and if a match is found, store the recipe name 
 * in an array list for future use.
 * 
 * @return An array list of recipe names that contain the ingredients requested by the user search.
 */
public ArrayList<String> search()
{
	for (int i = 0; i < searchQueryArray.size(); i++)
	{
		for (int j = 0; j < ingredientNameArray.size(); j++)
		{
			if (ingredientNameArray.get(j).equals(searchQueryArray.get(i)))
			{
				resultArray.add(recipeName);
			}
		}
	}
	return resultArray;
}
/**
 * The purpose of this method is the count the total number of recipes found.
 * 
 * @return The total number of recipes found.
 */
public int countResult()
{
	for (int i = 0; i < resultArray.size(); i++)
	{
		numberRecipes++;
	}
	return numberRecipes;
}
/**
 * The purpose of this method is to output the recipes found containing the ingredients that were searched for by the user.
 */
public void outputResult1()
{
	for (int i = 0; i< resultArray.size(); i++)
	{
		System.out.print(resultArray.get(i));
	}
}
/**
 * The purpose of this method is to output the number of recipes found when the user searched via ingredients.
 */
public void outputResult2()
{
	System.out.print(numberRecipes);
}
}
