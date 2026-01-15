package Lab05.q1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John Doe");
        p.setAge(25);
        System.out.printf("This person's name is %s and they are %d years old.\n",p.getName(),p.getAge());
    }
}
