package OOPs;
class Student{
    int rno;
    String name;
    float marks;

    Student(){
        System.out.println("Hello ");
    }

    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;

        System.out.println("Name: " + this.name + "\nRoll No: " + this.rno + "\nMarks: " + this.marks);
    }
}
public class OOP1 {
    public static void main(String[] args) {
        Student stu1 = new Student(23108026, "Jayavel", 99.2f);


    }
}
