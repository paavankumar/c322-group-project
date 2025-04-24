import java.util.ArrayList;

//  sorting strategy to sort recipes by ascending names
public class NameSort implements SortStrategy {
    public ArrayList<Recipe> sort(ArrayList<Recipe> recipes) {
        for (int i = 0; i < recipes.size() - 1; i++) {
            for (int j = i + 1; j < recipes.size(); j++) {
                if (recipes.get(i).getName().compareTo(recipes.get(j).getName()) > 0) {
                    Recipe temp = recipes.get(i);
                    recipes.set(i, recipes.get(j));
                    recipes.set(j, temp);
                }
            }
        }
        return recipes;
    }
}
