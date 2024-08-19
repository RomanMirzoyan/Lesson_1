public class Dog extends Animal {
    private static int countDogs = 0;

    public Dog() {
        super();
        countDogs++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println("Собака не может пробежать больше 500 м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println("Собака не может проплыть больше 10 м.");
        }
    }

    public static int getCountDog() {
        return countDogs;
    }
}