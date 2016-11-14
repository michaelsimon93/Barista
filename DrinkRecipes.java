import java.util.ArrayList;

//Class to build each specific drink
public class DrinkRecipes {

  public Recipe buildCaffeAmericano() {
    Recipe caffeAmericano = new RecipeBuilder().addIngredient(Ingredients.ESPRESSO, 3).buildRecipe();

    return caffeAmericano;
  }

  public Recipe buildCaffeLatte() {
    Recipe caffeLatte = new RecipeBuilder().addIngredient(Ingredients.ESPRESSO, 2)
      .addIngredient(Ingredients.STEAMED_MILK, 1).buildRecipe();

    return caffeLatte;
  }

  public Recipe buildCaffeMocha() {
    Recipe caffeMocha = new RecipeBuilder().addIngredient(Ingredients.ESPRESSO, 1)
      .addIngredient(Ingredients.COCOA, 1).addIngredient(Ingredients.STEAMED_MILK, 1)
      .addIngredient(Ingredients.WHIPPED_CREAM, 1).buildRecipe();

    return caffeMocha;
  }

  public Recipe buildCappuccino() {
    Recipe cappuccino = new RecipeBuilder().addIngredient(Ingredients.ESPRESSO, 2)
      .addIngredient(Ingredients.STEAMED_MILK, 1).addIngredient(Ingredients.FOAMED_MILK, 1).buildRecipe();

    return cappuccino;
  }

  public Recipe buildCoffee() {
    Recipe coffee = new RecipeBuilder().addIngredient(Ingredients.COFFEE, 3)
      .addIngredient(Ingredients.SUGAR, 1).addIngredient(Ingredients.CREAM, 1).buildRecipe();

    return coffee;
  }

  public Recipe buildDecafCoffee() {
    Recipe decafCoffee = new RecipeBuilder().addIngredient(Ingredients.DECAF_COFFEE, 3)
      .addIngredient(Ingredients.SUGAR, 1).addIngredient(Ingredients.CREAM, 1).buildRecipe();

    return decafCoffee;
  }

}
