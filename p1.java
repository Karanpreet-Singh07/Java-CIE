import java.util.*;
public class p1{
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        a = sc.nextInt();
        System.out.println("Enter Number 2: ");
        b = sc.nextInt();
        int c=-1;
        System.out.println("Enter Choice:  "); 
        System.out.println("1.+\t2-.\t3.*\t4./\t5.%\t");
        c = sc.nextInt();
        try{
            switch(c){
                case 1: System.out.println("Answer is "+ a+b); break;
                case 2: System.out.println("Answer is "+ (a - b)); break;
                case 3: System.out.println("Answer is "+ a*b); break;
                case 4: {
                    if(b==0) throw new ArithmeticException();
                    else System.out.println("Answer is "+ a/b);
                    break;
                }
                case 5: System.out.println("Answer is "+ a%b); break;
            }
        }catch (ArithmeticException e){
            System.out.println("Cant Divid By Zero");
        }
        sc.close();
    }
}