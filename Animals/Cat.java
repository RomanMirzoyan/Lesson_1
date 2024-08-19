public class Cat extends Animal {
    private static int countCats = 0;
    private boolean moan = false;

    public Cat() {
        super();
        countCats++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println("Кот не может пробежать больше 200 м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }
    public void eat(int countEat, int eatInBowl) {
        if (countEat <= eatInBowl) {
            System.out.println("Кот покушал.");
            countEat = true;
            eatInBowl -= countEat;
        } else {
            System.out.println("В миске недостаточно еды.");
        }
    }

    public static int getCountCats() {
        return countCats;
    }

    public boolean getMoan() {
        return moan;
    }
}
