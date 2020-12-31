/*
class Node {
  int data;
  Node left, right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

 class BinaryTree {
 Node root;

  static int heigtOfTree(Node root) {
    if (root == null) {
      return 0;
    }
    int lh = heigtOfTree(root.left);
    int rh = heigtOfTree(root.right);
    if (lh > rh) {
      return lh + 1;
    } else {
      return rh + 1;
    }
  }

  public static void main(String args[]) {
      BinaryTree tree =new BinaryTree();
      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(3);
      tree.root.left.left = new Node(4);
      tree.root.left.right = new Node(5);
    int h = tree.heigtOfTree(tree.root);
    System.out.println(h);
  }
}
*/


// Java program for the above approach

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

class GFG {

  static void findDifference(String start_date, String end_date) {

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    try {

      Date d1 = sdf.parse(start_date);
      Date d2 = sdf.parse(end_date);

      long difference_In_Time = d2.getTime() - d1.getTime();

      long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;

      System.out.print("Difference " + "between two dates is: ");

      System.out.println(+difference_In_Days + " days, ");
    }

    // Catch the Exception
    catch (ParseException e) {
      e.printStackTrace();
    }
  }

  // Driver Code
  public static void main(String[] args) {
    // Given start Date
    String start_date = "10-01-2015 01:10:20";

    // Given end Date
    String end_date = "10-06-2020 06:30:50";

    // Function Call
    findDifference(start_date, end_date);
  }
}

class CurrentDateTimeExample2 {
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH);
    Date firstDate = null;
    try {
      firstDate = sdf.parse("02-07-2010 01:10:20");
    } catch (ParseException e) {
      e.printStackTrace();
    }
    Date secondDate = null;
    try {
      secondDate = sdf.parse("10-02-2015 01:10:20");
    } catch (ParseException e) {
      e.printStackTrace();
    }

    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    System.out.println(diff);
  }
}

/*
class GetTickets {
    public static void main(String[] args) {


        int a[] = {7, 4, 8, 4, 3 ,1};

        int size = a.length;
        int ans = 0;
        int index = 1;
        int k=0;
        for(int i=1;i>0;i++)
        {
            if(a[k]!=0)
            {
                ans = ans+1;
                a[k] = a[k]-1;
                k=k+1;
                if(k%size==0)
                {
                    k=0;
                }
            }else{
                k = k+1;
                if(k%size==0)
                {
                    k=0;
                }

            }

            if(a[index]==0)
            {
                break;
            }
        }
        System.out.println(ans);
    }
}
*/

// AIzaSyAzTgLxX14N-FMRG7fJ00Namo1JLgTKF2c

public class Test {
  public int calcDistance(double latA, double longA, double latB, double longB) {
    double theDistance =
        (Math.sin(Math.toRadians(latA)) * Math.sin(Math.toRadians(latB))
            + Math.cos(Math.toRadians(latA))
                * Math.cos(Math.toRadians(latB))
                * Math.cos(Math.toRadians(longA - longB)));

    return 0;
  }

  public static double haversine(double lat1, double lng1, double lat2, double lng2) {
    int r = 6371; // average radius of the earth in km
    double dLat = Math.toRadians(lat2 - lat1);
    double dLon = Math.toRadians(lng2 - lng1);
    double a =
        Math.sin(dLat / 2) * Math.sin(dLat / 2)
            + Math.cos(Math.toRadians(lat1))
                * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLon / 2)
                * Math.sin(dLon / 2);
    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    double d = r * c;
    return d;
  }
  }