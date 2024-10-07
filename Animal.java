import java.util.ArrayList;

public class Animal {
    private String name;
    private boolean ableToWalk;
    private boolean ableToSwim;

    public Animal(String name) {
        this.name = name;
        if (name.contains("Lon")) {
            this.ableToWalk = true;
            this.ableToSwim = false;
        } else if (name.contains("Ca")) {
            this.ableToWalk = false;
            this.ableToSwim = true;
        } else if (name.contains("Vit")) {
            this.ableToWalk = true;
            this.ableToSwim = true;
        } else {
            this.ableToWalk = false;
            this.ableToSwim = false;
        }
    }

    public void setName(String newName) {
        this.name = newName;
        if (newName.contains("Lon")) {
            this.ableToWalk = true;
            this.ableToSwim = false;
        } else if (newName.contains("Ca")) {
            this.ableToWalk = false;
            this.ableToSwim = true;
        } else if (newName.contains("Vit")) {
            this.ableToWalk = true;
            this.ableToSwim = true;
        } else {
            this.ableToWalk = false;
            this.ableToSwim = false;
        }
    }

    public String getName() {
        return this.name;
    }

    public boolean isAbleToWalk() {
        return this.ableToWalk;
    }

    public boolean isAbleToSwim() {
        return this.ableToSwim;
    }

    public static void printAnimalsWalk(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            if (animal.isAbleToWalk()) {
                System.out.println("Animal: " + animal.getName());
            }
        }
    }

    public static void printAnimalsSwim(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            if (animal.isAbleToSwim()) {
                System.out.println("Animal: " + animal.getName());
            }
        }
    }

    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<>();

        Animal a0 = new Animal("Lon");
        animals.add(a0);
        Animal a1 = new Animal("Ca");
        animals.add(a1);
        Animal a2 = new Animal("Vit");
        animals.add(a2);
        Animal a3 = new Animal("Lon1");
        animals.add(a3);
        Animal a4 = new Animal("Ca1");
        animals.add(a4);
        Animal a5 = new Animal("Vit1");
        animals.add(a5);

        printAnimalsSwim(animals);
        printAnimalsWalk(animals);
    }
}
