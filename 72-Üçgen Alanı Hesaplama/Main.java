import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the points for a triangle:");
        double x1= input.nextDouble();
        double y1= input.nextDouble();
        double x2= input.nextDouble();
        double y2= input.nextDouble();
        double x3= input.nextDouble();
        double y3= input.nextDouble();

        double side1=Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        double side2=Math.pow(Math.pow(x3-x2,2)+Math.pow(y3-y2,2),0.5);
        double side3=Math.pow(Math.pow(x1-x3,2)+Math.pow(y1-y3,2),0.5);

        double s=(side1+side2+side3)/2;

        double area=Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);

        System.out.print("The area of triangle is:"+area);

    }
}