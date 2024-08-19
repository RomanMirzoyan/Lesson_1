public class Array {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        for (int i = 0; i < коты.length; i++) {
            cats[i] = new Cat();
        }

        int eatInBowl = 50;

        for (Cat cat : cats) {
            cat.eat(10, eatInBowl);
        }

        for (Cat cat : cats) {
            System.out.println("Кот сыт: " + cat.getMoan());
        }

        System.out.println("Количество животных: " + Aniaml.getCountAnimals());
        System.out.println("Количество собак: " + Dog.getCountDogs());
        System.out.println("Количество котов: " + Cat.getCountCats());
    }
}