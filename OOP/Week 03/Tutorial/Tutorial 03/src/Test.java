public class Test {
    public static void main(String[] args) {
        Director director = new Director("James", "Cameron");
        Date dob = new Date(16, 8, 1954);
        director.setDateOfBirth(dob);
        director.setNumDirectedMovie(23);

        System.out.println("DATE");
        System.out.println(dob.getDate());

        System.out.println(director);

        Movie movie = new Movie("Avatar", "Fantasy", director);
        System.out.println(movie);
        movie.setNumAwards(23);

        System.out.println(movie);
        System.out.println("Name of director is: " + movie.getDirector().getName());
        System.out.println("Surname of director is: " + movie.getDirector().getSurname());
        System.out.println("Number of awards is: " + movie.getNumAwards());





    }
}
