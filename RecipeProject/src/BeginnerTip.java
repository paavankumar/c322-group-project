// decorator class for beginner-level cooking tips
public class BeginnerTip extends RecipeDecorator {

    // passes recipe we are wrapping to the decorator's constructor
    public BeginnerTip(Recipe recipe) {
        this.recipe = recipe;
    }

    // adds some tips for beginner cooks
    public String getDescription() {
        return recipe.getDescription() +
                "\nTips:\n" +
                "- Read the full recipe once before starting.\n" +
                "- Wash and prep all ingredients before turning on the stove.\n" +
                "- Keep a timer nearby so you don’t forget cooking times.";
    }

    @Override
    void listIngredients() {

    }

    @Override
    void cookFood() {

    }


    // adjusts cooking time to accommodate extra time needed for beginner cooks
    public int getCookingTime() {
        return recipe.getCookingTime() + 15;
    }
}

