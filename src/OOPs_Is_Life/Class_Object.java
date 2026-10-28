package OOPs_Is_Life;

public class Class_Object {
    public static void main(String[] args) {
        //System.out.println("Hellow, World!");
        //Default ctor.

        // Student A = new Student();
        // A.id = 1;
        // A.age = 18;
        // A.name = "Sanju";
        // A.nos = 5;

        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.nos);

        // A.bunk();
        // A.study();
        // A.sleep();

        // Parametereised constructor
        Student A = new Student(1,20,"Aman",3);
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.nos);

        // A.bunk();
        // A.study();
        // A.sleep();

        //Copy constructor
        Student B = new Student(A);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.nos);

        B.bunk();
        B.study();
        B.sleep();
    }
}
