class Invalidage extends Exception{
    Invalidage(String s){super(s);}
}

class InsBal extends Exception{
    InsBal(String s) {super(s);}
    InsBal(String s, Throwable c) {super(s,c);}
}

class Employee{
    void register(String name, int age) throws Invalidage{
        if(age<18 || age>60) throw new Invalidage("Enter correct age");
        else System.out.println("Registered Sucess");
    }
}

class Account{
    int bal=10000;
    void withdrow(double amt) throws InsBal{
        if(bal<amt){
            throw new InsBal("Insufficent Balance");
        }
        bal-=amt;
        System.out.println("Remained Bal: "+ bal);
    }
    void withdrawamt(String amt) throws InsBal{
        try{
            withdrow(Double.parseDouble(amt));
        }catch(NumberFormatException e){
            throw new InsBal("INs Funds",e);
        }
    }
}

public class p8 {
    public static void main(String[] args){
        Employee e = new Employee();
        Account a = new Account();

        try{
            e.register("Karan", 18);
            a.withdrow(5000);
            e.register("Dharam", 65);
        }catch(Invalidage | InsBal ex){
            System.out.println("Error: "+ ex.getMessage());
        }finally{
            System.out.println("Attempt Completed");
        }

        try{
            a.withdrow(1001000);
        }catch(InsBal ex){
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("Executed");
        }

        try{
            a.withdrawamt("abc");
        }catch(InsBal ex){
            System.out.println("Error: "+ ex.getMessage());
            System.out.println("Cause: "+ ex.getCause());
        }
    }
}
