public class Animal {
     double animalRun;
     double animalJump;
     double animalSwim;

    Animal(double animalRun, double animalJump, double animalSwim) {
        this.animalRun = animalRun;
        this.animalJump = animalJump;
        this.animalSwim = animalSwim;
    }


    public boolean run(double value) {
        return animalRun > value;
    }


    public boolean jump(double value) {
        return animalJump > value;
    }


    public boolean swim(double value) {
        return animalSwim > value;
    }

    double getAnimalRun() {
        return animalRun;
    }

    double getAnimalJump() {
        return animalJump;
    }

    double getAnimalSwim() {
        return animalSwim;
    }
    public interface AnimalInterface {

       boolean run(int value);

       boolean jump(int value);

      boolean swim(int value);

    }



}
