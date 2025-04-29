//concrete subclass that extends Recipe
public class VeggieBurger extends Recipe {

    //constructor
    public VeggieBurger() {
        //initializes name of this recipe
        name = "Veggie Burger";
        //initializes calorie count
        calories = 3420;
        //initializes total cooking time parameter
        cookingTime = 35;
        //initializes description of a veggie burger
        description = "A delicious option for dinner!";
    }

    //implements abstract listIngredients() method with this recipe's ingredients
    void listIngredients() {
        //prints out all the ingredients in a list
        System.out.println("Ingredients Needed:");
        System.out.println("1 can of black beans\n1 cup of brown rice\n1/3 cup of bread crumbs\n1 tablespoon of chili powder\nAny desired toppings");
    }

    //implements abstract cookFood() method with this recipe's cooking process
    void cookFood() {
        //prints out directions for cooking the rice, creating patties, and grilling the patties
        System.out.println("Cook brown rice in a rice cooker.");
        System.out.println("Heat skillet on medium heat");
        System.out.println("Mash black beans into paste.");
        System.out.println("Stir beans, rice, chili powder, and bread crumbs together into a mixture.");
        System.out.println("Shape mixture into individual patties.");
        System.out.println("Spray skillet with Pam.");
        System.out.println("Cook or grill patties on the skillet for 4 minutes on each side.");
        System.out.println("Place any toppings on cooked patties.");
    }
}
