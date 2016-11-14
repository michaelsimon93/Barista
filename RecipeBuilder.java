//Class to create a new recipe and allow ingredients and the ingredient price
//to be added to a drink.
public class RecipeBuilder {

  private Recipe drinkRecipe = new Recipe();

  RecipeBuilder addIngredient(Ingredients ingredient, int quantity) {
    for (int i = 0; i < quantity; i++) {
      drinkRecipe.addIngredient(ingredient);
      drinkRecipe.addToPrice(ingredient.getIngredientCost());
    }
    return this;
  }

  Recipe buildRecipe() {
    return drinkRecipe;
  }

}
