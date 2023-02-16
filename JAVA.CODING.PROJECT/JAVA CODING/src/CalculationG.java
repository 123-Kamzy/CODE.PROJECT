public class CalculationG {
    public static double multiplication(double digit1,double digit2){
        return digit1*digit2;
    }
    public static double square(double digit1) {
        return digit1*digit1;
    }
    public static double sum(double digit1,double digit2){
        return digit1+digit2;
    }
    public static void outline(String message,double results){
        System.out.println(message+results);
    }
    public static void main(String[] args) {
        double gravity=-9.81;
        double fallingTime =30;
        double initialVelocity=0.0;
        double finalVelocity;
        double initialPosition=0.0;
        double finalPosition=0.0;
        double value=0.5;
        System.out.println("The object's position after "+fallingTime+"seconds is "+finalPosition+"m.");
        //x(t)=0.5*at^2+vit+xi
        finalPosition=(value*(gravity*fallingTime*fallingTime)+(initialVelocity*fallingTime)+initialPosition)/fallingTime;
        System.out.println("finalPosition:"+finalPosition);
        //v(t)=at+vi
        finalVelocity=gravity*fallingTime/fallingTime;
        System.out.println("finalVelocity area:"+finalVelocity);
        double digit1=10;
        double digit2=15;
        double c=multiplication(digit1,digit2);
        outline("multiplication",c);
        double d=square(digit1);
        outline("powering to square:",d);
        double e=sum(digit1,digit2);
        outline("sum",e);





    }
}
