//--------------Question1------------------
// Question1:-

// find the varience and the varience % of the data>


//details

// product            sales21                 sales22
// tea                  100                     120
// coffee               100                     110
// greenTea             75                      100





//-----------code---------------
import java.util.ArrayList;


public class Question1{
     public static void main(String[] args)  {
      String[] product={"Tea ","Coffee","Green Tea"};
      int[] sale21={100,100,75};
      int[] sale22={120,110,100};
      ArrayList<Double> var=new ArrayList<>();
      ArrayList<Double> varPer=new ArrayList<>();
      System.out.println("product          Sales 2021          Sale 2020            varience               varience(%)");
      for(int i=0;i<sale21.length;i++){
        var.add(i, (double) ((sale22[i]-sale21[i])));
        varPer.add(i,(double)((var.get(i)/sale22[i])*100));
        System.out.println(product[i] +"           " +sale21[i]+"               "+sale22[i]+"                "+var.get(i)+"                "+varPer.get(i));
      }

     }
}

//     ---------------output----------------------

//       product          Sales 2021          Sale 2020            varience               varience(%)
//       Tea            100               120                20.0                16.666666666666664
//       Coffee           100               110                10.0                9.090909090909092
//       Green Tea           75               100                25.0                25.0