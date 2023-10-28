public class Director {

    private String name;
    private String surname;
    private int numDirectedMovie;
    private Date dateOfBirth;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumDirectedMovie() {
        return numDirectedMovie;
    }

    public void setNumDirectedMovie(int numDirectedMovie) {
        this.numDirectedMovie = numDirectedMovie;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        String dob = this.dateOfBirth.getDay()+"/"+this.dateOfBirth.getMonth()+"/"+this.dateOfBirth.getYear();
        return "Director [name = " + this.name + ", surname = " + this.surname + ", dob = " + dob + "]";
    }
}
