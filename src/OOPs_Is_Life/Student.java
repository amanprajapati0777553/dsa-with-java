package OOPs_Is_Life;

public class Student {
    //Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //Default ctor // attr.  -> garbage.
    public Student(){
        System.out.println("Student Default ctor called");
    }

    // Parametereised constructor
    public Student(int id,int age,String name,int nos){
        System.out.println("Student Parameterised constructor Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //Methods / Behaviours
    public void study(){
        System.out.println(name + " Studying");
    }
    public void sleep(){
        System.out.println(name + " Sleeping");
    }
    public void bunk(){
        System.out.println(name + " Bunking");
    }
}
