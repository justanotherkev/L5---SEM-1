public class Student extends Person {

    private double fee;
    private int grade;
    private int IDNumber;


    public Student(String name, int age, String gender, int IDNumber) {
        super(name, age, gender);
        this.IDNumber = IDNumber;
    }


    //Getters
    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Setters
    public int getIDNum() {
        return this.IDNumber;
    }

    public double getFee() {
        return fee;
    }

    public int getGrade() {
        return grade;
    }


    @Override
    public String toString() {
        return super.toString()
                + "\nID number: " + this.IDNumber
                + "\nGrade: " + this.grade
                + "\nFee: " + this.fee;
    }
}
