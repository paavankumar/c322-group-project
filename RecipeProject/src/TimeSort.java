import java.util.ArrayList;
import java.util.List;

// sorting strategy to sort recipes by cooking time (ascending)
public class TimeSort implements SortStrategy {
    public ArrayList<Recipe> sort(ArrayList<Recipe> recipes) {
        for (int i = 0; i < recipes.size() - 1; i++) {
            for (int j = i + 1; j < recipes.size(); j++) {
                if (recipes.get(i).getCookingTime() > recipes.get(j).getCookingTime()) {
                    Recipe temp = recipes.get(i);
                    recipes.set(i, recipes.get(j));
                    recipes.set(j, temp);
                }
            }
        }
        return recipes;
    }
}
