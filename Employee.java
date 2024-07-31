public class Employee {
     private String fullName;
     private String position;
     private String email;
     private String phoneNumber;
     private int salary;
     private int age;

     public Employee() {
          this.fullName = "fullName";
          this.position = "position";
          this.email = "email";
          this.phoneNumber = "phoneNumber";
          this.salary = 50000;
          this.age = 25;
     }

     public void info() {
          System.out.println(
                    "ФИО: " + fullName + "; должность: " + position + "; email: " + email + "; телефон: "
                              + phoneNumber + "; зарплата: " + salary + "; возраст: " + age);
     }

     
     
}