//concrete subclass that extends Recipe
public class TacoSalad extends Recipe {

    //constructor
    public TacoSalad() {
        //initializes name of this recipe
        name = "Taco Salad";
        //initializes calorie count
        calories = 350;
        //initializes total cooking time parameter
        cookingTime = 25;
        //initializes description through getDescription getter method
        description = getDescription();
    }

    //implements abstract listIngredients() method with this recipe's ingredients
    void listIngredients() {
        //prints out all the ingredients in a list
        System.out.println("Ingredients Needed:");
        System.out.println("1/4 cup of tomatoes\n1/2 cup of lettuce\n1/4 of cheese\n1 bell pepper\n1 avocado\n1/2 pound of ground turkey");
    }

    //implements abstract cookFood() method with this recipe's cooking process
    void cookFood() {
        //prints out directions for heating up a pan, browning the meat, and mixing all the food together
        System.out.println("Separate the ground turkey from the raw ingredients.");
        System.out.println("Spray pan with Pam and heat to medium-high on stovetop.");
        System.out.println("Brown ground turkey by stirring it in the pan for about 10 minutes.");
        System.out.println("Mix ground turkey back into the other ingredients.");
    }
}