/*
class Hacker implements Runnable{
public void run()
        {
        try
        {
        for(int i=0;i<2;i++)
        {
        Thread.sleep(100);
        System.out.print(" "+Thread.currentThread().getName());
        }
        }
        catch(InterruptedException e)
        {
        System.out.print("Exception Occured "+e);
        }
        }
        }
 class Demo
{
    public static void main(String args[])
    {
        Hacker obj = new Hacker();
        Thread t = new Thread(obj,"Java");
        Thread t1 = new Thread(obj,"PHP");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
    }
}*/


import java.util.Scanner;

public class IHS
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int numCount= in.nextInt();
        int[] arr = new int[numCount];

        for(int i=0; i<numCount;i++)
        {
            arr[i]=in.nextInt();
        }

        int sum = in.nextInt();
        getPairsCount(numCount,arr, sum);
    }


    public static void getPairsCount(int numCount,int[] arr, int sum)
    {

        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;

        System.out.println(count);
    }
}