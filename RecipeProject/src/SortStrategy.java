import java.util.ArrayList;

// interface for different sorting strategies
public interface SortStrategy {
    ArrayList<Recipe> sort(ArrayList<Recipe> recipes);
}
