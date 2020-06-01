import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        double distanceRun =200;
        double distanceJump = 3;
        double distanceSwim =0;
        Cat cat = new Cat(distanceRun, distanceJump, distanceSwim);

        distanceRun =500;
        distanceJump =1;
        distanceSwim = 10;
        Animal dog = new Dog(distanceRun, distanceJump, distanceSwim);


        System.out.println("Кошка может пробежать: " + cat.getAnimalRun() +
                " м. \nСобака может пробежать: " + dog.getAnimalRun() + " м.");

        System.out.println("Введите дистанцию для бега:");
        double distance = scanner.nextDouble();

        System.out.println("Кошка пытается выполнить бег(" + distance + "). Результат: " + cat.run(distance));
        System.out.println("Собака пытается выполнить бег(" + distance + "). Результат: " + dog.run(distance));
        System.out.println("\n****************\n");

        System.out.println("Кошка может прыгнуть: " + cat.getAnimalJump() +
                " м. \nСобака может прыгнуть: " + dog.getAnimalJump() + " м.");

        System.out.println("Введите высоту препятствия:");
        distance = scanner.nextDouble();

        System.out.println("Кошка пытается выполнить прыжок(" + distance + "). Результат: " + cat.jump(distance));
        System.out.println("Собака пытается выполнить прыжок(" + distance + "). Результат: " + dog.jump(distance));
        System.out.println("\n****************\n");

        System.out.println("Кошка может проплыть: " + cat.getAnimalSwim() +
                " м. \nСобака может проплыть: " + dog.getAnimalSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextDouble();

        System.out.println("Кошка пытается выполнить плавать(" + distance + "). Результат: " + cat.swim(distance));
        System.out.println("Собака пытается выполнить плавать(" + distance + "). Результат: " + dog.swim(distance));

    }

}
