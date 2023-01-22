public class Complex{
    double x, y;
    Complex(double r, double i){
     this.x = r;
     this.y = i;
    }
    public static Complex sum(Complex c1, Complex c2)
    {
         Complex temp = new Complex(0, 0);
 
         temp.x = c1.x + c2.x;
         temp.y = c1.y+ c2.y;
         return temp;
     }
     public static void main(String args[]) {
     Complex c1 = new Complex(2, 3);
     Complex c2 = new Complex(3, 4.5);
         Complex temp = sum(c1, c2);
         System.out.printf("Sum is: "+ temp.x+" + "+ temp.y +"i");
     }
 }