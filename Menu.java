import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//Menu class to access and iterate a menu object.
public class Menu implements Iterable<Entry<Integer, DrinkBuilder>> {

  HashMap<Integer, DrinkBuilder> menu;

  //constructor creates a new menu instance
  public Menu() {
    menu = new HashMap<Integer, DrinkBuilder>();
    this.createMenu();
  }

  //create the menu with the necessary drinks
  public void createMenu() {
    DrinkRecipes buildRecipe = new DrinkRecipes();

    menu.put(DrinkName.CAFFE_AMERICANO.getDrinkNum(),
      		new DrinkBuilder(DrinkName.CAFFE_AMERICANO, buildRecipe.buildCaffeAmericano()));

    menu.put(DrinkName.CAFFE_LATTE.getDrinkNum(),
          new DrinkBuilder(DrinkName.CAFFE_LATTE, buildRecipe.buildCaffeLatte()));

    menu.put(DrinkName.CAFFE_MOCHA.getDrinkNum(),
          new DrinkBuilder(DrinkName.CAFFE_MOCHA, buildRecipe.buildCaffeMocha()));

    menu.put(DrinkName.CAPPUCCINO.getDrinkNum(),
          new DrinkBuilder(DrinkName.CAPPUCCINO, buildRecipe.buildCappuccino()));

  	menu.put(DrinkName.COFFEE.getDrinkNum(), new DrinkBuilder(DrinkName.COFFEE, buildRecipe.buildCoffee()));

    menu.put(DrinkName.DECAF_COFFEE.getDrinkNum(),
  				new DrinkBuilder(DrinkName.DECAF_COFFEE, buildRecipe.buildDecafCoffee()));
  }

  public DrinkBuilder getDrink(DrinkName drinkName) {
    return menu.get(drinkName.getDrinkNum());
  }

  //Allows you to iterate through the menu
  @Override public Iterator<Entry<Integer, DrinkBuilder>> iterator() {
    return menu.entrySet().iterator();
  }
}
