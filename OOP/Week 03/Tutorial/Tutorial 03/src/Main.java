public class Main {
    public static void main(String[] args) {
        Date date = new Date(16, 8, 1954);

        System.out.println(date.toString());

        Director director = new Director("James", "Cameron");
        director.setDateOfBirth(date);
        director.setNumDirectedMovie(23);
        System.out.println(director.toString());

    }
}