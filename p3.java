class Complex{
    int r;
    int i;
    Complex(int r,int i){
        this.r=r;
        this.i=i;
    }
    Complex(Complex c){
        this.r = c.r;
        this.i = c.i;
    }
    Complex add(Complex c){
        return new Complex(r+c.r, i+c.i);
    }
    Complex sub(Complex c){
        return new Complex(r-c.r, i-c.i);
    }
    Complex mul(Complex c){
        int a = (r*c.r)-(i*c.i);
        int b = (r*c.i)+(i*c.r);
        return new Complex(a,b);
    }
    boolean isEqual(Complex c){
        return (r==c.r && i==c.i);
    }
    void display(){
        if(i<0) System.err.println(r+"-"+(-i)+"i");
        else System.err.println(r+"+"+(i)+"i");
    }

}

public class p3 {
    public static void main(String[] args){
        Complex c1= new Complex(2,5);
        Complex c2= new Complex(3,6);
        Complex c3= new Complex(c1);

        c1.add(c2).display();
        c1.sub(c2).display();
        c1.mul(c2).display();

        if(c1.isEqual(c3)) System.out.println("Equal");
        else System.out.println("Not Equal");

        if(c1.isEqual(c2)) System.out.println("Equal");
        else System.out.println("Not Equal");

    }
}
