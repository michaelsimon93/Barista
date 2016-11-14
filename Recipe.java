import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//Class for a recipe. Used as an interface to put together and access
//a drink's recipe. 
public class Recipe implements Iterable<Entry<Ingredients, Integer>> {

  private HashMap<Ingredients,Integer> recipe = new HashMap<Ingredients,Integer>();
  private double totalCost;

  public void addIngredient(Ingredients ingredient) {
    Integer quantity = recipe.get(ingredient);
    if (quantity == null) {
      recipe.put(ingredient, 1);
    }
    else {
      recipe.put(ingredient, ++quantity);
    }
  }

  public void addToPrice(double cost) {
    this.totalCost += cost;
  }

  @Override public Iterator<Entry<Ingredients,Integer>> iterator() {
    return recipe.entrySet().iterator();
  }

  public double getCost() {
    return totalCost;
  }
}
