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
