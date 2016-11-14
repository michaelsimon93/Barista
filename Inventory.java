import java.util.Map.Entry;
import java.util.TreeMap;

//Class is used for the Inventory of the ingredients.
public class Inventory {

  //created a TreeMap for the inventory so the ingredients will
  //stay sorted alphabetically
  private TreeMap<Ingredients, Integer> inventory;

  //Constructor creates a new inventory instance and stocks it with items
  public Inventory() {
    inventory = new TreeMap<Ingredients, Integer>();
    stockItems();
  }

  public void stockItems() {
    for (Ingredients ingredient : Ingredients.values()) {
      inventory.put(ingredient, 10);
    }
  }

  public Integer getInventory(Ingredients ingredient) {
    Integer quantity = inventory.get(ingredient);
    return quantity;
  }

  //Method to subtract ingredients from the inventory when
  //used to make a drink
  public void subtractInventory(Ingredients ingredient, Integer quantity) {
    Integer newQuantity = inventory.get(ingredient);
    newQuantity -= quantity;
    inventory.put(ingredient, newQuantity);
  }

  //Checks to see if ingredients are in stock
  boolean inStock(Ingredients ingredient, Integer neededQuantity) {
    int remainingQuantity = inventory.get(ingredient);
    if (remainingQuantity >= neededQuantity) {
      return true;
    }
    return false;
  }

  void printInventory() {
    System.out.println("Inventory: ");
    for (Entry<Ingredients, Integer> item : inventory.entrySet()) {
      System.out.println(item.getKey() + ","  + item.getValue());
    }
  }

}
