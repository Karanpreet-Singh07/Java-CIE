class Person{
    String gen, name;
    int age;
    Person(String name, String gen, int age){
        this.name= name;
        this.gen=gen;
        this.age=age;
    }
    void display(){
        System.out.println(name+"\t"+age+"\t"+gen+"\t");
    }
}
class Employee extends Person{
    int id;
    String dept;
    int sal;
    Employee(String name, String gen,int age, int id,String dept, int sal){
        super(name,gen,age);
        this.id=id;
        this.dept=dept;
        this.sal=sal;
    }
    void display(){
        System.out.println(id+"\t"+name+"\t"+age+"\t"+gen+"\t"+dept+"\t"+sal+"\t");
    }
}
class Student extends Person{
    String usn;
    int sem;
    Student(String name, String gen,int age, String usn, int sem){
        super(name,gen,age);
        this.sem=sem;
        this.usn=usn;
    }
    void display(){
        System.out.println(name+"\t"+age+"\t"+gen+"\t"+sem+"\t"+usn+"\t");
    }
}


public class p4 {
    public static void main(String[] args){
        Person[] p = new Person[4];
        p[0] = new Employee("Karan", "M", 19, 101, "Cse", 100000);
        p[1] = new Employee("MXXXk", "F", 20, 102, "Cse", 100002);
        p[2] = new Student("Charan", "M", 23, "CI063", 3);
        p[3] = new Student("Yaar", "M", 20, "CI1313", 3);
        for(int i=0; i<p.length; i++){
            p[i].display();
        }
    }
}
