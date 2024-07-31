public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phoneNumber, int salary, int age) {

         System.out.println();
         this.fullName = fullName;
         this.position = position;
         this.email = email;
         this.phoneNumber = phoneNumber;
         this.salary = salary;
         this.age = age;
}

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer",
                                   "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Pavlov Pavel", "Analyst",
                                   "pavlov@mailbox.com", "898765432", 40000, 35);
        persArray[2] = new Person("Semenov Semen", "DevOps",
                                   "semenov@mailbox.com", "898765439", 50000, 40);
        persArray[3] = new Person("Sergeev Sergey", "Desinger",
                                   "sergeev@mailbox.com", "898765438", 60000, 45);
        persArray[4] = new Person("Alexeev Alexey", "Product Owner",
                                   "alexeev@mailbox.com", "898765437", 70000, 50);
    }
}
