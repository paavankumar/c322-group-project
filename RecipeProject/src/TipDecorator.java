public abstract class TipDecorator extends Recipe {

    Recipe recipe;

    public TipDecorator(String name, int calories, int cookingTime, String description) {
        super(name, calories, cookingTime, description);
    }

    public abstract String getDescription();

}
