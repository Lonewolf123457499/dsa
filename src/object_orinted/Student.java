package object_orinted;

public class Student
{
    int id;
    String name;
    int age;
    public Student(int idd,String nam)
    {
        this.id =idd;
        this.name=nam;
    }
    public Student(int id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

class Mainbn
{
    public static void main(String[] args) {
        Student st=new Student(10,"vedant singh");
        System.out.println(st.id+" -------"+st.name);
        new Student(10,"vedantsingh",20);
    }
}
