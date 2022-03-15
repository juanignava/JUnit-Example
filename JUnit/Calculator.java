import static org.junit.Assert.assertEquals;
import java.lang.reflect.Constructor;
import org.junit.Test;

 public class Calculator {

    public Calculator(){
        // class constructor
    }

    /**
     * @return the addition of two values
     */
    public int addition(int x, int y) {
        return x + y;
    }

    /**
     * @return the substraction of two values
     */
    public int substraction(int x, int y) {
        return x - y;
    }

    /**
     * @return the division of two values
     * @throws Exception
     */
    public int division(int x, int y) throws Exception {
        if (y != 0) {
            return x/y;
        }
        else {
            throw new Exception("Can not divide by 0");
        }
    }

    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 5;
        Calculator calc = new Calculator();
        int add = calc.addition(a,b);
        int sub = calc.substraction(a, b);
        int div = calc.division(a, b);
        System.out.println("The addition result is: " + add);
        System.out.println("The addition result is: " + sub);
        System.out.println("The division result is: " + div);
    }
 }