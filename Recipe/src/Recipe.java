import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Sean McDonald
 * Date: 3/28/14
 * Class: CS 181 MWF 12:30pm
 * Assignment 5
 * 
 * The purpose of this class is to contain all the methods that are used for the user to input the recipes, ingredients,
 * ingredient amount, and ingredient amount unit types.
 * 
 * ingredientNameArray - Array list of ingredient names
 * recipeName - Holds the name of the recipe for the object
 * amountArray - Array list of ingredient amounts
 * unitTypeArray - Array list of the unit types
 * b - An index for the ingredient names
 *
 */
public class Recipe
{
	public ArrayList<String> ingredientNameArray;
	public String recipeName;
	private ArrayList<Double> amountArray;
	private ArrayList<String> unitTypeArray;
	public int b;
	
	
/**
 * This method uses all the other methods to take in the user input and store it in an object before being passed to the
 * RecipeList class.
 * 
 * @return A Recipe class object for use in the RecipeList class.
 */
	public Recipe getRecipe()
	{
		String inputRecipeName = "";
		ArrayList<String> inputIngredientNameArray = new ArrayList<String>();
		ArrayList<Double> inputAmountArray = new ArrayList<Double>();
		ArrayList<String> inputUnitTypeArray = new ArrayList<String>();
		Recipe instantiateRecipe = new Recipe();
		instantiateRecipe.getRecipe();
		while (!instantiateRecipe.ingredientNameArray.get(b).equals("none"))
			{
				instantiateRecipe.inputRecipe(inputRecipeName);
				instantiateRecipe.recipeToInstance(inputRecipeName);
				instantiateRecipe.getIngredient(inputIngredientNameArray);
				instantiateRecipe.ingredientToInstance(inputIngredientNameArray);
				instantiateRecipe.getIngredientAmount(inputAmountArray);
				instantiateRecipe.amountToInstance(inputAmountArray);
				instantiateRecipe.getUnitType(inputUnitTypeArray);
				instantiateRecipe.unitToInstance(inputUnitTypeArray);
				instantiateRecipe.b++;
			}
		return instantiateRecipe;
	}
	/**
	 * This method asks for the user input regarding the name of a recipe.
	 * 
	 * @param inputRecipeName The local variable input version of the recipeName instance variable for holding the
	 * recipe name.
	 * @return The inputRecipeName variable but with information stored within.
	 */
	public String inputRecipe(String inputRecipeName)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input recipe name ('none' to stop: ");
		inputRecipeName = in.next();
		return inputRecipeName;
	}
	/**
	 * This method stores the inputRecipeName local variable into the recipeName instance variable to be used in the
	 * getRecipe method.
	 * 
	 * @param inputRecipeName The local variable containing data of the recipe name entered by the user.
	 * @return The instance variable containing the information that was in inputRecipeName.
	 */
	public String recipeToInstance(String inputRecipeName)
	{
		recipeName = inputRecipeName;
		return recipeName;
	}
	/**
	 * This method has the user input ingredient names to be stored in an array list.
	 * 
	 * @param inputIngredientNameArray A local version of the array list containing the ingredient names.
	 * @return The inputIngredientNameArray variable filled via input from the user.
	 */
	public ArrayList<String> getIngredient(ArrayList<String> inputIngredientNameArray)
	//gets the ingredient name(s)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input ingredient name ('none' to stop: ");
		inputIngredientNameArray.add(in.next());
		return inputIngredientNameArray;
	}
	/**
	 * This method stores the local variable inputIngredientNameArray into the instance variable ingredientNameArray.
	 * 
	 * @param inputIngredientNameArray the array list of ingredient names input by the user.
	 * @return The ingredientNameArray instance variable containing user input of the ingredient names.
	 */
	public ArrayList<String> ingredientToInstance(ArrayList<String> inputIngredientNameArray)
	{
		ingredientNameArray = inputIngredientNameArray;
		return ingredientNameArray;
	}
	/**
	 * This method has the user input the amount of each ingredient entered.
	 * 
	 * @param inputAmountArray The array list of ingredient amounts input by the user.
	 * @return The array list of ingredient amounts filled with input by the user.
	 */
	public ArrayList<Double> getIngredientAmount(ArrayList<Double> inputAmountArray)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input ingredient unit: ");
		inputAmountArray.add(in.nextDouble());
		return inputAmountArray;
	}
	/**
	 * This method stores the local variable inputAmountArray into the instance variable amountArray.
	 * 
	 * @param inputAmountArray The array list of amounts of ingredients input by the user.
	 * @return The instance variable containing ingredient amounts.
	 */
	public ArrayList<Double> amountToInstance(ArrayList<Double> inputAmountArray)
	{
		amountArray = inputAmountArray;
		return amountArray;
	}
	/**
	 * This method has the user input the unit types and stores them in an array list.
	 * 
	 * @param inputUnitTypeArray The array list of unit types input by the user.
	 * @return The array list of unit types now filled by input from the user.
	 */
	public ArrayList<String> getUnitType(ArrayList<String> inputUnitTypeArray)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input unit type: ");
		inputUnitTypeArray.add(in.next());
		return inputUnitTypeArray;
	}
	/**
	 * This method stores the data in inputUserTypeArray into the instance variable unitTypeArray.
	 * 
	 * @param inputUnitTypeArray The array list of unit types.
	 * @return The instance variable now containing the data that was contained in inputUnitTypeArray.
	 */
	public ArrayList<String> unitToInstance(ArrayList<String> inputUnitTypeArray)
	{
		unitTypeArray = inputUnitTypeArray;
		return unitTypeArray;
	}
}
