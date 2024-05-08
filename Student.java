public class Student {

    private String name;
    private int age;
    private int id;

    public Student(String name, int age, int id) {

        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getter and Setters for the
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void printStudent() {
        System.out.println("Name:" + name + "  " + "Age:" + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Tushar", 24, 101);
        Student s2 = new Student("Anjali", 22, 102);

        s1.printStudent();
        s2.printStudent();
    }
}
