public class EasyTip extends TipDecorator {

    public EasyTip(Recipe recipe) {
       super(recipe.name, recipe.calories, recipe.cookingTime, recipe.description);
       this.recipe = recipe;
    }

    public String getDescription() {
        return recipe.getDescription() + "Some tip for bad cooks";
    }
}
