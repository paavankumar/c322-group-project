import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean appRunning = true;
        Scanner scanner = new Scanner(System.in);
        RecipeBook recipeBook = RecipeBook.getInstance(); // use of singleton here to create our single recipeBook
        /* all possible recipes */
        Recipe tacoSalad = new TacoSalad();
        Recipe tomatoSoup = new TomatoSoup();
        Recipe chickenAndDumplings = new ChickenAndDumplings();
        Recipe veggieBurger = new VeggieBurger();
        /* all sorts */
        int experienceTracker;
        CalorieSort cSort = new CalorieSort();
        NameSort nSort = new NameSort();
        TimeSort tSort = new TimeSort();

        System.out.println("Welcome to our Recipe Application!");
        System.out.println("Before we start, what kind of cook are you?");
        System.out.println("1- Beginner");
        System.out.println("2- Intermediate");
        System.out.println("3- Expert");
        experienceTracker = scanner.nextInt();
        if (experienceTracker < 1 || experienceTracker > 3) {
            System.out.println("Invalid input! Program ending now.");
            appRunning = false;
        }
        while(appRunning) {
            System.out.println("What would you like to do? Input the proper number.");
            System.out.println("1 - See all recipes in my recipe book");
            System.out.println("2 - Cook a recipe in your book");
            System.out.println("3 - Add recipe to recipe book");
            System.out.println("4 - Exit");
            int userOption = scanner.nextInt();
            switch (userOption) {
                /* See all recipes in my recipe book */
                case 1 -> {
                    System.out.println("Would you like to sort your recipes by");
                    System.out.println("1- Calorie count");
                    System.out.println("2- Name");
                    System.out.println("3- Time to cook");
                    int sortOption = scanner.nextInt();
                    /* use of strategy pattern here */
                    switch (sortOption) {
                        case 1 -> cSort.sort(recipeBook.getRecipes());
                        case 2 -> nSort.sort(recipeBook.getRecipes());
                        case 3 -> tSort.sort(recipeBook.getRecipes());
                        default -> System.out.println("Invalid input! Going back to main menu.");
                    }
                    recipeBook.printAllRecipes();
                }
                /* Cook a recipe in your book */
                case 2 -> {
                    scanner.nextLine(); // filter out the \n from hitting enter
                    System.out.println("Which of your recipes would you like to cook?");
                    String recipeName = scanner.nextLine();
                    /* decorator pattern here */
                    switch (recipeName) {
                        case "Taco Salad" -> {
                            if (recipeBook.getRecipes().contains(tacoSalad)) {
                                switch (experienceTracker) {
                                    case 1 -> tacoSalad = new BeginnerTip(tacoSalad);
                                    case 2 -> tacoSalad = new IntermediateTip(tacoSalad);
                                    case 3 -> tacoSalad = new ExpertTip(tacoSalad);
                                }
                                System.out.println(tacoSalad.getDescription());
                                tacoSalad.makeRecipe();
                            } else System.out.println("You have not added this recipe to your recipe book yet!");
                        }
                        case "Tomato Soup" -> {
                            if (recipeBook.getRecipes().contains(tomatoSoup)) {
                                switch (experienceTracker) {
                                    case 1 -> tomatoSoup = new BeginnerTip(tomatoSoup);
                                    case 2 -> tomatoSoup = new IntermediateTip(tomatoSoup);
                                    case 3 -> tomatoSoup = new ExpertTip(tomatoSoup);
                                }
                                System.out.println(tomatoSoup.getDescription());
                                tomatoSoup.makeRecipe();
                            } else System.out.println("You have not added this recipe to your recipe book yet!");
                        }
                        case "Chicken and Dumplings" -> {
                            if (recipeBook.getRecipes().contains(chickenAndDumplings)) {
                                switch (experienceTracker) {
                                    case 1 -> chickenAndDumplings = new BeginnerTip(chickenAndDumplings);
                                    case 2 -> chickenAndDumplings = new IntermediateTip(chickenAndDumplings);
                                    case 3 -> chickenAndDumplings = new ExpertTip(chickenAndDumplings);
                                }
                                System.out.println(chickenAndDumplings.getDescription());
                                chickenAndDumplings.makeRecipe();
                            } else System.out.println("You have not added this recipe to your recipe book yet!");
                        }
                        case "Veggie Burger" -> {
                            if (recipeBook.getRecipes().contains(veggieBurger)) {
                                switch (experienceTracker) {
                                    case 1 -> veggieBurger = new BeginnerTip(veggieBurger);
                                    case 2 -> veggieBurger = new IntermediateTip(veggieBurger);
                                    case 3 -> veggieBurger = new ExpertTip(veggieBurger);
                                }
                                System.out.println(veggieBurger.getDescription());
                                veggieBurger.makeRecipe();
                            } else System.out.println("You have not added this recipe to your recipe book yet!");
                        }
                        default -> System.out.println("Invalid input! Going back to main menu.");
                    }
                }
                /* Add recipe to the recipe book */
                case 3 -> {
                    System.out.println("What recipe would you like to do? Input the proper number.");
                    System.out.println("1 - Taco Salad");
                    System.out.println("2 - Chicken and Dumplings");
                    System.out.println("3 - Tomato Soup");
                    System.out.println("4 - Veggie Burger");
                    int recipeOption = scanner.nextInt();
                    switch (recipeOption) {
                        case 1 -> {
                            if (recipeBook.getRecipes().contains(tacoSalad)) {
                                System.out.println("This recipe is already in your recipe book.");
                            } else {
                                recipeBook.addRecipe(tacoSalad);
                                System.out.println("Taco Salad added to your recipe book!");
                            }
                        }
                        case 2 -> {
                            if (recipeBook.getRecipes().contains(chickenAndDumplings)) {
                                System.out.println("This recipe is already in your recipe book.");
                            } else {
                                recipeBook.addRecipe(chickenAndDumplings);
                                System.out.println("Chicken and Dumplings added to your recipe book!");
                            }
                        }
                        case 3 -> {
                            if (recipeBook.getRecipes().contains(tomatoSoup)) {
                                System.out.println("This recipe is already in your recipe book.");
                            } else {
                                recipeBook.addRecipe(tomatoSoup);
                                System.out.println("Tomato Soup added to your recipe book!");
                            }
                        }
                        case 4 -> {
                            if (recipeBook.getRecipes().contains(veggieBurger)) {
                                System.out.println("This recipe is already in your recipe book.");
                            } else {
                                recipeBook.addRecipe(veggieBurger);
                                System.out.println("Veggie Burger added to your recipe book!");
                            }
                        }
                        default -> System.out.println("Invalid input! Going back to main menu.");
                    }
                }
                /* Exit program */
                case 4 -> {
                    System.out.println("Hope the recipes were helpful!");
                    appRunning = false;
                }
                default -> {
                    System.out.println("Invalid input! Program ending now.");
                    appRunning = false;
                }
            }
        }

        /*
        Decorator (COMPLETED)1
        Singleton (COMPLETED)
        Strategy (COMPLETED)
        Template (COMPLETED)
         */
    }
}