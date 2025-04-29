// decorator class for intermediate-level cooking tips
public class IntermediateTip extends RecipeDecorator {

    // passes recipe we are wrapping to the decorator's constructor
    public IntermediateTip(Recipe recipe) {
        this.recipe = recipe;
    }

    // adds some tips for intermediate cooks
    public String getDescription() {
        return recipe.getDescription() +
                "\nTips:\n" +
                "- Prep and portion everything beforehand.\n" +
                "- Practice consistent knife cuts for even cooking.\n" +
                "- Taste and adjust seasonings as you go.\n";
    }

    @Override
    void listIngredients() {

    }

    @Override
    void cookFood() {

    }

    // leaves cooking time alone for intermediate cooks
    public int getCookingTime() {
        return recipe.getCookingTime();
    }
}

