class Employee{
    String name, dept;
    int age, id, salary;

    Employee(String name, String dept, int age, int id, int salary){
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.id = id ;
        this.salary = salary;
    }

    // getters 
    String getName() {return name;}
    String getDept(){return dept;}
    int getAge(){return age;};
    int getId(){return id;}
    int getSalary(){return salary;}
    
    // setter 
    void setName(String name) {this.name = name;}
    void setDept(String dept){this.dept=  dept;}
    void setAge(int age){this.age= age;};
    void setId(int id){this.id= id;}
    void setSalary(int salary){this.salary = salary;}

    void display(){
        System.err.println(id+"\t"+name+"\t"+dept+"\t"+age+"\t"+salary+"\t");
    }

}

public class p2 {
    public static void main(String[] args){
        Employee[] e = new Employee[3];
        e[0]= new Employee("Karan", "Cse", 19, 102, 1000000);
        e[1]= new Employee("Kacha", "Ai", 19, 102, 1000000);
        e[2]= new Employee("Gavi", "Cse", 19, 102, 1000001);

        for(int i=0; i<3; i++){
            e[i].display();
        }
        
        int total=0;
        for(int i=0; i<3; i++){
            if(e[i].getDept().equals("Cse")){
                total+= e[i].getSalary();
            }
        }
        System.err.println("Total Sal:" + total);
        
        Employee maxi =null;
        for(int i=0; i<3; i++){
            if(e[i].getDept().equals("Cse")){
                if(maxi==null || maxi.getSalary()<(e[i].getSalary())){
                    maxi = e[i];
                }
            }
        }
        maxi.display();
    }
}
