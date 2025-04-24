// abstract class for the recipe decorator which we will use to add tips and time
// changes for different skill levels dynamically without changing the recipe itself
public abstract class RecipeDecorator extends Recipe {

    // the recipe object that is being decorated
    Recipe recipe;

    // abstract method to change the description to include new tips
    public abstract String getDescription();

    // abstract method to change the time to accommodate for skill level
    public abstract int getCookingTime();

}

