package animal;

import edible.IEdible;

public class Tiger extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Tiger: Gao oh...Gao oh...Gaooo";
    }

    @Override
    public String howToEat() {
        return "Meat Meat!!";
    }
}
