//concrete subclass that extends Recipe
public class TomatoSoup extends Recipe {

    //constructor
    public TomatoSoup() {
        //initializes name of this recipe
        name = "Tomato Soup";
        //initializes calorie count
        calories = 180;
        //initializes total cooking time parameter
        cookingTime = 20;
        //initializes description of tomato soup
        description = "A warm and comforting soup you can make any time of the day!";
    }

    //implements abstract listIngredients() method with this recipe's ingredients
    void listIngredients() {
        //prints out all the ingredients in a list
        System.out.println("Ingredients Needed:");
        System.out.println("1 can of tomatoes\n1/2 onion\n4 tablespoons of butter\n1/4 cup of basil");
    }

    //implements abstract cookFood() method with this recipe's cooking process
    void cookFood() {
        //prints out directions for heating up a pan and summering the soup
        System.out.println("Heat a pot on the stovetop to medium heat.");
        System.out.println("Pour ingredients into pot.");
        System.out.println("Let simmer for 10-12 minutes while partially covered.");
    }
}
