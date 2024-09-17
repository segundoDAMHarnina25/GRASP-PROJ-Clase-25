package ejercicio04;

public class Chef {
    public void cookPaella() {
        Dish dish = new DishImpl("paella");

        dish.addIngredient(new Ingredient("rice"));
        dish.addIngredient(new Ingredient("chicken"));
        dish.addIngredient(new Ingredient("peas"));

       
        dish.mix();
        dish.cook();
        dish.serve();
    }
}
