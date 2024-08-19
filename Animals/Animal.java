ppublic class Animal {
    private static int countAnimals = 0;

    public Animal() {
        countAnimals++;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }

    public static int getCountAnimals() {
        return countAnimals;
    }
}
