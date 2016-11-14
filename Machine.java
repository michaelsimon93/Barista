import java.util.ArrayList;
import java.util.Map.Entry;

//Class for the coffee machine.
public class Machine {

  private Menu menu;
  private Inventory inventory;

  //Constructor creates new menu and inventory instances
  public Machine() {
    menu = new Menu();
    inventory = new Inventory();
  }

  public void printInventory() {
    inventory.printInventory();
  }

  void printMenu() {
      System.out.println("Menu: ");

      for (Entry<Integer, DrinkBuilder> item : menu) {
        DrinkBuilder drink = item.getValue();
        boolean buildable = drink.inStockIndicator(inventory);

        System.out.println(item.getKey() + "," + drink.getName() + ","
          + String.format("$%.2f", drink.getCost()) + "," + buildable);
      }
  }

  public void dispense(DrinkName drinkName) throws OutOfStockException {

    DrinkBuilder drink = menu.getDrink(drinkName);

    if (!drink.inStockIndicator(inventory)) {
      throw new OutOfStockException("Out of Stock: " + drink);
    }
    System.out.println("Dispensing: " + drink.getName());
    drink.build(inventory);
  }

  public void restock() {
    inventory.stockItems();
  }
}
