abstract class Bank{
    String name;
    int ac;
    double bal;
    Bank(String name, int ac, double bal){
        this.name= name;
        this.ac=ac;
        this.bal=bal;
    }
    void display(){
        System.out.println("Name: "+name+" "+"Acc Num: "+ac+" "+"Balance: "+bal+" ");
    }
    abstract void calInterest();
}

class CityBank extends Bank{
    CityBank(String name, int ac, double bal) {super(name,ac,bal);}
    void calInterest(){
        display();
        System.out.println("CityBank: "+(bal*8/100));
    }
}
class SBIBank extends Bank{
    SBIBank(String name, int ac, double bal) {super(name,ac,bal);}
    void calInterest(){
        display();
        System.out.println("SBIBank: "+(bal*7.5/100));
    }
}
class CanaraBank extends Bank{
    CanaraBank(String name, int ac, double bal) {super(name,ac,bal);}
    void calInterest(){
        display();
        System.out.println("CanaraBank: "+(bal*8/100));
    }
}


public class p6 {
    public static void main(String[] args){
        Bank[] b = new Bank[3];
        b[0]= new CityBank("Karan", 101, 100000.0);
        b[1]= new SBIBank("Karan", 102, 100000.0);
        b[2]= new CanaraBank("Karan", 103, 100000.0);
        for(int i=0 ;i<3 ;i++){
            b[i].calInterest();
        }
    }
}
