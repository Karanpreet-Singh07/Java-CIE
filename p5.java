class Area{
    void calci(double r){
        System.out.println("Circle Area: "+3.14*r*r);
    }
    void calci(double l, double b){
        System.out.println("Rectangle Area: "+ l*b);
    }
    void calci(int height ,int base){
        System.out.println("Circle Area: "+(0.5*height*base));
    }
}

class Shape{
    double area(){return 0;}
    double peri(){return 0;}
    void display(){
        System.out.println("Area "+ area() +" "+ "Perimeter: "+ peri());
    }
}

class rect extends Shape{
    double l,b;
    rect(double l, double b){
        this.l=l;
        this.b=b;
    }
    double area() {return l*b;}
    double peri() {return 2*(l+b);}
}
class circle extends Shape{
    double r;
    circle(double r){
        this.r=r;
    }
    double area() {return 3.14*r*r;}
    double peri() {return 2*3.14*r;}
}
class triangle extends Shape{
    double l,b,s1,s2;
    triangle(double l, double b, double s1, double s2){
        this.l=l;
        this.b=b;
        this.s1=s1;
        this.s2=s2;
    }
    double area() {return (0.5*l*b);}
    double peri() {return b+s1+s2;}
}

public class p5 {
    public static void main(String[] args){
        Area a= new Area();
        a.calci(5.0);
        a.calci(5.0,10.0);
        a.calci(5,6);

        Shape[] s= new Shape[3];
        s[0] = new rect(4, 6);
        s[1] = new circle(10);
        s[2] = new triangle(2, 3, 5, 5);

        for(int i=0; i<3; i++){
            s[i].display();
        }
    }
}
