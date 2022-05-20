//Name:
//Period:
import java.util.*;

public class ChangeMakerAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double[] change = {20, 10, 5, 1 , .25, .10, .05, .01};

        System.out.println("Price of item?");
        double itemPrice = console.nextDouble();

        System.out.println("Amount tendered?");
        double cashPaid = console.nextDouble();

        makeChange(itemPrice , cashPaid);

    }

    public static void makeChange(double itemPrice, double cashPaid)
    {
        double[] change = {20, 10, 5, 1 , .25, .10, .05, .01};

        double changeDue = cashPaid - itemPrice;

        double[] changeArray = new double[8];

        for (int i = 0; i < change.length; i++)
        {
            changeArray[i] = changeDue / change[i];
            changeDue = changeDue % change[i];
        }

        for (int i = 0; i < changeArray.length; i++)
        {
            System.out.println(change[i] + ": " + (int) (changeArray[i]));
        }
    }



}