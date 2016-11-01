/**
 * CS/COE 0401 Lab 4: Slot Machine Simulation
 * @author Zac Yu <me@zacyu.com>
 */

import java.util.Scanner;

public class Lab6
{
    public static void main (String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("How many items are you entering: ");
        final int count = stdin.nextInt();

        double[] arr = new double[count];

        for (int i = 0; i < count; ++i)
        {
            arr[i] = stdin.nextDouble();
        }

        System.out.printf("arr[]: max = %f, min = %f, sum = %f, ave = %f\n",
          max(arr), min(arr), sum(arr), ave(arr));

        System.exit(0);
    }

    public static double max(double[] data)
    {
        double max = data[0];
        for (int i = 1; i < data.length; i++)
        {
            max = data[i] > max ? data[i] : max;
        }
        return max;
    }

    public static double min(double[] data)
    {
        double min = data[0];
        for (int i = 1; i < data.length; i++)
        {
            min = data[i] < min ? data[i] : min;
        }
        return min;
    }

    public static double sum(double[] data)
    {
        double sum = 0;
        for (double e : data)
        {
            sum += e;
        }
        return sum;
    }

    public static double ave(double[] data)
    {
        double sum = 0;
        for (double e : data)
        {
            sum += e;
        }
        return sum / data.length;
    }
}
