package animal;
import edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: cuc tac..cuc tac..";
    }


    @Override
    public String howToEat() {
        return "could be fried!!";
    }
}
