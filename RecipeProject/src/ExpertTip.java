// decorator class for expert-level cooking tips
public class ExpertTip extends RecipeDecorator {

    // passes recipe we are wrapping to the decorator's constructor
    public ExpertTip(Recipe recipe) {
        this.recipe = recipe;
    }

    // adds some tips for expert cooks
    public String getDescription() {
        return recipe.getDescription() +
                "\nTips:\n" +
                "- Invest in good quality kitchenware.\n" +
                "- Layer flavors with aromatics, spices, and slow cooking.\n" +
                "- Experiment with plating for presentation and texture contrast.";
    }

    @Override
    void listIngredients() {
        recipe.listIngredients();
    }

    @Override
    void cookFood() {
        recipe.cookFood();
    }

    // lessens cooking time for expert cooks
    public int getCookingTime() {
        return recipe.getCookingTime() - 15;
    }
}

