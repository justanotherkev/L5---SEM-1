public class TestClass {

    public static void main(String[] args) {

        Person jack = new Person("Jack Brooke", 27, "M");
        System.out.println();
        System.out.println(jack);
        Student beth = new Student("Elisabeth Smith", 16, "F", 122233);
        System.out.println();
        System.out.println(beth);
        Teacher sam = new Teacher("Sam Hamilton", 34, "M", "Computer Science", 50000);
        System.out.println();
        System.out.println(sam);

//        Person p = new Teacher ("Sam Hamilton", 34, "M", "Computer Science", 50000);
//        Teacher t = new Person ("Sam Hamilton", 34, "M", "Computer Science", 50000);
//        Person s = new Student ("Elisabeth Smith", 16, "F", 122233);

    }
}
