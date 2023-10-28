public class Teacher extends Person {

    private double salary;
    private String subject;


    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    // Getters
    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    // Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSalary: " + this.salary
                + "\nSubject: " + this.subject;
    }
}
