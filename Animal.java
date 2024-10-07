import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract boolean canSwim();
    public abstract boolean canWalk();

    public String getName() {
        return name;
    }
}

class Pig extends Animal {
    public Pig(String name) {
        super(name);
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}

class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}

class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return false;
    }
}

class Farm {
    private List<Animal> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printSwimmersAndWalkers() {
        for (Animal animal : animals) {
            if (animal.canSwim() || animal.canWalk()) {
                System.out.printf("%s - Can swim: %s, Can walk: %s%n",
                        animal.getName(), animal.canSwim(), animal.canWalk());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addAnimal(new Pig("Lợn"));
        farm.addAnimal(new Duck("Vịt"));
        farm.addAnimal(new Fish("Cá"));

        farm.printSwimmersAndWalkers();
    }
}