// import Classes.Pokemon;
import Classes.*;
import Classes.test.*; //For importing all the classes of the package
// import Classes.test.car;
// import Classes;

public class objectpractice {
    public static void main(String[] args){
        Pokemon Deodrill = new Pokemon("Deodrill",156);

        Pokemon Pikachu = new Pokemon("Pikachu",145);

        // pikachu.name = "Pikachu" ;
        // pikachu.xp = 145;
        Pikachu.attack();
        Deodrill.attack();
        car Toyota = new car("Toyota");
        Toyota.announce();

        Pizza pizza = new Pizza("thicc crust","tomato","mozzerella","pepperoni");
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);

        System.out.println(pizza); //using overriding toString() method

        
        
    }
    
}
