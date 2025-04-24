// abstract base class for recipes
public abstract class Recipe {
    // name of the recipe
    String name;
    // number of calories in the recipe
    int calories;
    // cooking time in minutes
    int cookingTime;
    // description of the recipe
    String description;

    // getter method to return the recipe name
    public String getName() {
        return name;
    }

    // getter method to return the calorie count
    public int getCalories() {
        return calories;
    }

    // getter method to return the cooking time
    public int getCookingTime() {
        return cookingTime;
    }

    // getter method to return the description
    public String getDescription() {
        return description;
    }

}

