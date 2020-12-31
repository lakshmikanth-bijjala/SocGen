/*
import java.util.*;
import java.io.*;
import static java.util.Map.Entry;
import static java.util.Map.Entry.comparingByValue;

import java.util.stream.Collectors;

class solution {


    public static void main(String[] args) {

*/
/*
// Declare the map
HashMap<String,String[]> map = new HashMap<String,String[]>();
map.put("Node",new String[]{"Media"});
map.put("MediaAccessLink",new String[]{"MediaAccessProvider","Media"});
map.put("Route",new String[]{"Node","JobFactory"});
map.put("JobFactory",new String[]{});
map.put("MediaAccessProvider",new String[]{});
map.put("Media",new String[]{});
System.out.println(dependencyList(map));*/
/*


      Integer i = null;
      System.out.println("value of i is :" + i);
      String j = String.valueOf(i);
      System.out.println("value of j is :" + j);
    }

    public static List<String> dependencyList(HashMap<String,String[]>map)
    {

      List<String> printList = new ArrayList<>();
      Map<String, String[]> treeMap = new TreeMap<String, String[]>();
      Iterator<Map.Entry<String, String[]>> iterator = map.entrySet().iterator();

      int len = map.size();
      while(len != printList.size()){
        for(String key : map.keySet()){
          if(map.get(key).length == 0){
            printList.add(key);
            map.remove(key);
            break;
          }else{
            int count = 0;
            String[] values = map.get(key);
            for(String value : values){
              if(!printList.contains(value)){
                break;
              }
              count++;
            }
            if(count == values.length){
              printList.add(key);
              map.remove(key);
              break;
            }
          }
        }
      }
      return printList;

    }
  }


*/

// Java program to check valid
// Aadhar number using regex.
/*
import java.util.regex.*;
class solution {

  // Function to validate Aadhar number.
  public static void isValidAadharNumber(String str) throws Exception {
    // Regex to check valid Aadhar number.
    String aadharRegex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";

    // Compile the ReGex
    Pattern p = Pattern.compile(aadharRegex);

    if (str == null) {
      throw new Exception("Aadhar Number is required.");
    }

    Matcher m = p.matcher(str);

    Boolean value = Boolean.valueOf(m.matches());
    if (Boolean.FALSE.equals(value)) {
      throw new Exception("Aadhar Number is invalid.");
    }
  }

  // Driver Code.
  public static void main(String args[]) throws Exception {

    // Test Case 1:
    String str1 = "3675 9834 6015";
    isValidAadharNumber(str1);

    // Test Case 2:
    String str2 = "4675 9834 6012 8";
    isValidAadharNumber(str2);

    // Test Case 3:
    String str3 = "0175 9834 6012";
    isValidAadharNumber(str3);

    // Test Case 4:
    String str4 = "3675 98AF 60#2";
    isValidAadharNumber(str4);

    // Test Case 5:
    String str5 = "417598346012";
    isValidAadharNumber(str5);
  }
}*/
/*


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class solution {
  public static void main(String[] args)throws Exception {
*/
/*    String stringDate="31-12-1998";
Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(stringDate);
System.out.println(stringDate+"\t"+date1);*/
/*




*/
/* String stringDate="31-12-1998";
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
LocalDate date = LocalDate.parse(stringDate, formatter);
System.out.println(date);*/
/*


    String stringDate="31-12-1998";
*/
/*    DateFormat formatter;
Date date;
new SimpleDateFormat("dd-MM-yyyy").format(str_date);*/
/*


    System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(stringDate));

  }
}*/

import org.springframework.boot.json.JsonParser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*public class solution {
  public static void main(String args[]) {

    String reKycDateString = "02-11-2020";
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    Date currentDate = new Date();
    Long differenceInDays = 0L;
    boolean isReKycRequired;
    try {

      Date reKycDate = df.parse(reKycDateString);

      if (reKycDate.compareTo(currentDate) < 0) {
        isReKycRequired = true;
        System.out.println("reKycDate is less than currentDate");
        }

      if (reKycDate.compareTo(currentDate) > 0) {
        System.out.println("reKycDate is greater than currentDate");
        Long differenceInTime = Math.abs(currentDate.getTime() - reKycDate.getTime());
        differenceInDays = TimeUnit.DAYS.convert(differenceInTime, TimeUnit.MILLISECONDS);
        if(differenceInDays < 8) {
          isReKycRequired = true;
          System.out.println("KYC need to be done again");
        }
        else {
          isReKycRequired = false;
        }
      }

      // System.out.println("Date in dd-MM-yyyy format is: "+df3.format(d3));
    } catch (Exception ex) {
      System.out.println(ex);
    }
  }
}*/

public class solution {

    private String myregex = "";
    public static void main(String[] args) {
        String mother = "MR. BIJJALA LAXMI KANTH";
        Pattern p = Pattern.compile(mother);
        Matcher m = p.matcher(mother);
        boolean b = m.matches();
    }
  }