import animal.Animal;
import animal.Tiger;
import animal.Chicken;
import edible.IEdible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Lemon;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {

        //kiem thu animal
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals [1] = new Chicken();

        for (Animal animal :animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                IEdible iEdible1 = (Chicken) animal;
                System.out.println(iEdible1.howToEat());
            }

            if (animal instanceof Tiger) {
                IEdible iEdible2 = (Tiger) animal;
                System.out.println(iEdible2.howToEat());
            }
        }

        //kiem thu fruit
        Fruit[] fruits =new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Lemon();

        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
