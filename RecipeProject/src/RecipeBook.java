import java.util.ArrayList;
import java.util.List;

// singleton class representing a shared RecipeBook instance for our project
// the goal is to ensures only one instance exists across the application
public class RecipeBook {

    // ensuring multiple threads handle the uniqueInstance variable correctly
    // when it is initialized to the singleton instance
    private volatile static RecipeBook uniqueInstance;

    // list that stores all recipes in the recipe book
    private ArrayList<Recipe> recipes;

    // private constructor for instantiation
    private RecipeBook() {
        recipes = new ArrayList<>();
    }

    // returns the singleton instance of RecipeBook (creates the instance
    // if it doesn't already exist)
    public static RecipeBook getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new RecipeBook();
        }
        return uniqueInstance;
    }

    // method to add recipes to recipe book
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    // method to print all the recipe names in the recipe book
    public void printAllRecipes() {
        for (int i = 0; i < recipes.size(); i++) {
            System.out.println(recipes.get(i).getName());
        }
    }
}
