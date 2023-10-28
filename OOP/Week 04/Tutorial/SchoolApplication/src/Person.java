public class Person {

    protected String name;
    protected int age;
    protected String gender;  // “M” for male, “F” for female

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    // Getter
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }


    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String toString() {
        return "Name: " + this.name
                + "\nAge: " + this.age
                + "\nGender: " + this.gender;
    }
}
