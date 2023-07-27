public class Person {
    String firstName;
    String lastName;
    int age;
    double height;
    double weight;
    String gender;
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, double height, double weight, String gender){
        this(firstName, lastName, age);
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int getAge() {

        return age;
    }

    public boolean isTeen() {

        return (age <= 19 && age >= 13);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
