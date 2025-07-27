package Day_2_PractiseOops;

public class Student {
    String name;
    int age;
    double gpa;
    Student(String a,int age,double gpa){
        this.name=a;
        this.age=age;
        this.gpa=gpa;

    }
    void show(){
        System.out.println(this.name+","+this.age+","+this.gpa+"is Studying");
    }
}
