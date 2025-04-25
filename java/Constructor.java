public class Constructor {
    public static void main(String args[]) {
        //Student s1 = new Student();
        Student s1 = new Student("krishna");
        System.out.println(s1.name);

    }
}

class Student {
    String name;
    int roll;

    /* Student() {
        System.out.println("constructor is called....");
       
    } */
    Student(String name) {
        this.name = name;
    }

}
