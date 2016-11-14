import java.util.Map.Entry;

//Class for a drink
public class DrinkBuilder {

  private Recipe drinkRecipe;
  private DrinkName drinkName;

  //Constructor 
  public DrinkBuilder(DrinkName drinkName, Recipe drinkRecipe) {
    this.setName(drinkName);
    this.setRecipe(drinkRecipe);
  }

  public String toString() {
    return getName().toString();
  }

  //builds the drink and subtracts the amount of the needed ingredients from
  //the inventory when it is built
  public void build(Inventory inventory) {
    for (Entry<Ingredients, Integer> item : this.getRecipe()) {
      inventory.subtractInventory(item.getKey(), item.getValue());
    }
  }

  //Checks to see if the needed ingredients for a drink are in stock
  public boolean inStockIndicator(Inventory inventory) {
    for (Entry<Ingredients, Integer> item : getRecipe()) {
      if (!(inventory.inStock(item.getKey(), item.getValue()))) {
        return false;
      }
    }
    return true;
  }

  private void setName(DrinkName name) {
    this.drinkName = name;
  }

  public DrinkName getName() {
    return drinkName;
  }

  private void setRecipe(Recipe drinkRecipe) {
    this.drinkRecipe = drinkRecipe;
  }

  public Recipe getRecipe() {
    return drinkRecipe;
  }

  public Double getCost() {
    return getRecipe().getCost();
  }
}
