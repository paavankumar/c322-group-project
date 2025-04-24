public abstract class Recipe {
    String name;
    int calories;
    int cookingTime;
    String description;

    public Recipe(String name, int calories, int cookingTime, String description) {
        this.name = name;
        this.calories = calories;
        this.cookingTime = cookingTime;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public int getCalories() {
        return calories;
    }
    public int getCookingTime() {
        return cookingTime;
    }
    public String getDescription() {
        return description;
    }

}
