import java.util.ArrayList;

//  sorting strategy to sort recipes by ascending calories
public class CalorieSort implements SortStrategy {
    public ArrayList<Recipe> sort(ArrayList<Recipe> recipes) {
        for (int i = 0; i < recipes.size() - 1; i++) {
            for (int j = i + 1; j < recipes.size(); j++) {
                if (recipes.get(i).getCalories() > recipes.get(j).getCalories()) {
                    Recipe temp = recipes.get(i);
                    recipes.set(i, recipes.get(j));
                    recipes.set(j, temp);
                }
            }
        }
        return recipes;
    }
}
