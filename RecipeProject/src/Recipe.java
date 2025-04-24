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

    //final method that implements template design and calls all necessary methods in the cooking process
    final void makeRecipe() {
        //provides list of all ingredients for the recipe
        listIngredients();
        //gives directions on how to get started
        prepWorkStation();
        //instructs user what to do with ingredients
        chopIngredients();
        //instructs user on next steps for mixing ingredients
        combineIngredients();
        //gives directions on how to cook the food (simmer, boil, etc.)
        cookFood();
        //tells user how to plate the food
        plate();
    }

    //abstract method allows concrete subclasses to implement method with differing features
    //gives individualized ingredients for each recipe
    abstract void listIngredients();

    //each recipe requires same prep process
    void prepWorkStation() {
        //prints out directions on how to prepare
        System.out.println("Wash your hands.\nWipe down countertops.\nGather all ingredients.");
        System.out.println("Get necessary cooking utensils ready, like knives, measuring cups, and a cutting board.");
    }

    //chopIngredients() tells users how to handle their ingredients initially
    void chopIngredients() {
        //prints out each step to get the ingredients ready
        System.out.println("Measure out each ingredient using the measuring cups.");
        System.out.println("Wash the ingredients with water as needed.");
        System.out.println("Take the first ingredient and chop it into bite-size pieces.");
        System.out.println("Repeat this process until each ingredient is prepped.");
        System.out.println("Wash cutting board and utensils as you go to keep your work station clean.");
    }

    //combineIngredients() gives next step on how to mix ingredients
    void combineIngredients() {
        //prints out each step on mixing the ingredients
        System.out.println("Gather the prepped ingredients together in a bowl.");
        System.out.println("Mix together using a pair of tongs.");
    }

    //abstract method allows concrete subclasses to implement method with differing features
    //gives individualized approach for the actual cooking method
    abstract void cookFood();

    //plate() tells users how to finish up making their desired recipe
    void plate() {
        //prints out the steps to clean up the kitchen and get the food ready
        System.out.println("Clean up the kitchen and put away utensils.");
        System.out.println("Place ingredients in the serving dish.");
        System.out.println("Grab your drink of choice.");
        System.out.println("Enjoy!");
    }

}

