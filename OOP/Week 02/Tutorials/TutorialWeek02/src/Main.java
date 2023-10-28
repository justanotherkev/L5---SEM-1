public class Main {
    public static void main(String[] args) {

        Person p = new Person("Ben");
        p.displayName();

        Person p2 = new Person("James");
        p2.setSurname("Brown");
        p2.setAge(42);

        Person p3 = new Person("Max");
        p3.setSurname("Stern");
        p3.setAge(36);

        Person p4 = new Person("Annie");
        p4.setSurname("Cornelle");
        p4.setAge(54);

        p2.displayName();
        System.out.println(p2.getSurname());
        System.out.println(p2.getAge());

        p3.displayName();
        System.out.println(p3.getSurname());
        System.out.println(p3.getAge());

        p4.displayName();
        System.out.println(p4.getSurname());
        System.out.println(p4.getAge());


    }
}