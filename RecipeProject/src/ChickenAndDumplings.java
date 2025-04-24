//concrete subclass that extends Recipe
public class ChickenAndDumplings extends Recipe {

    //constructor
    public ChickenAndDumplings() {
        //initializes name of this recipe
        name = "Chicken and Dumplings";
        //initializes calorie count
        calories = 460;
        //initializes total cooking time parameter
        cookingTime = 40;
        //initializes description through getDescription getter method
        description = getDescription();
    }

    //implements abstract listIngredients() method with this recipe's ingredients
    void listIngredients() {
        //prints out all the ingredients in a list
        System.out.println("Ingredients Needed:");
        System.out.println("1 can of condensed cream of chicken soup\n1.5 cans of chicken broth\n1.5 cups of precooked shredded chicken\n1 can of biscuit dough");
    }

    //implements abstract cookFood() method with this recipe's cooking process
    void cookFood() {
        //prints out directions for heating up the pot, simmering the ingredients in the pot, and mixing in the dumplings
        System.out.println("Heat pot up to medium-high heat on stovetop.");
        System.out.println("Pour condensed cream of chicken soup, chicken broth, and shredded chicken into pot.");
        System.out.println("Let pot heat until it simmers.");
        System.out.println("Now, mix in the dough bits and stir.");
        System.out.println("Turn stovetop heat to medium-low and let sit for 15 minutes.");
    }
}