
interface Compute{
    double convert(double val);
}

class GBtoMB implements Compute{
    public double convert(double gb) {return gb*1002039;}
}

class Eurotoinr implements Compute{
    public double convert(double euro) {return euro*90;}
}

interface Pay{
    int calci();
}

class perEmp implements Pay,Compute{
    int sal;
    perEmp(int sal) {this.sal=sal;}
    public int calci() {return sal;}
    public double convert(double d) {return 90*d;}
}

class tempEmp implements Pay{
    int sal, hour;
    tempEmp(int sal, int h){
        this.sal=sal;
        this.hour=h;
    }
    public int calci() {return hour*sal;}
}

public class p7 {
    public static void main(String[] a){
            Compute c= new GBtoMB();
            System.out.println("2 GB in MB: "+ c.convert(2));
            c= new Eurotoinr();
            System.out.println("50 Euro in Inr: "+ c.convert(50));

            Pay p1 = new perEmp(6000);
            Pay p2 = new tempEmp(500,50);
            
            System.out.println("Full Pay: "+ p1.calci());
            System.out.println("Contract Pay: "+ p2.calci());
            
            // 2 interface in 1 class
            perEmp p3 = new perEmp(6000);
            System.out.println("1000 Euro in inr: "+ p3.convert(1000));

    }
}
