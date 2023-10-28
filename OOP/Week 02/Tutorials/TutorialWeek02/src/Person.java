public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public void displayName(){
        System.out.println(this.name);
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getSurname(){
        return this.surname;
    }

    int getAge() {
        return this.age;
    }

}
