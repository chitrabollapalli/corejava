package com.psceudocode;

import javax.naming.ldap.StartTlsRequest;

public class PseudocodeProblems {

    public static void main(String[] args) {


        /*Using while loop

        int n = 10;
        int i=1;
        while (i<=n)
        {
            System.out.println(i);
            i++;
        }*/


      /*  // Using For loop


        int n=10;
        lnt i


        for ( i=1; i<=n;i++){
            System.out.println(i);

        }
*/
        //Addition of two Numbers
        /*
        int a=10;
        int b=20;

        int c=a+b;
        System.out.println(c);*/

        /*//Print Even or odd Number using if condition

        int i=100;
        if(i%2==0)// using if condition
        {
            System.out.println("even number" +i);
        }
        else
        {
            System.out.println("odd numbers" +i);
        }*/

       /* // without using if condition

        int i=23;

        String res=(i%2==0) ? "EVEN" : "ODD";
        System.out.println(res + " " +i);*/

        /*//given numbers print even and odd numbers Using if stmt

       // int i={19,20,1,5,23,6,8,9,2,11,4,10}; error int only store one value
        int[] num={19,20,1,5,23,6,8,9,2,11,4,10};
        for(int i:num) {
        if (i % 2 == 0) {
        System.out.println("Even" + i);
        }
    else {
        System.out.println("ODD" + i);
    }
}*/
        /*//given numbers print even and odd numbers without Using if stmt

        int[] numbers={32,54,8,9,0,5,4,6,45,82,56,42,13,15,17,22,12,34};
        for(int j:numbers)
        {
            String str=(j%2==0) ? "EVEN" : "ODD";
            System.out.println(str +j);
        }*/

       /* // Here i want to print Even onside After ODD numbers onside

        int[] EvOd={1,2,3,22,54,7,9,13,17,16,15,28,91,202,79,303,404};
        System.out.println("Even Numbers");
        for(int Evn:EvOd) {
           if (Evn % 2 == 0) {
                System.out.println("Even Numbers" + "  " +Evn);

            }

           // System.out.println((Evn%2==0) ? Evn + "" : "" );
        }

                System.out.println("List of ODD Numbers");
                for(int od:EvOd) {
                  if(od%2!=0)
                  {
                      System.out.println("ODD Numbers"+ "  " +od);
                  }

                 // System.out.println((od%2!=0) ? od + " " : " ");

              }
*/

        /*// Print Highest Number < and >

        int a = 123;
        int b = 65;
     if (a>b)
     {
       System.out.println("Grestest number:  "+a);
     }
     else
     {
         System.out.println("Smallest number" +b);
     }


        */

        // Find highest number in Array

        int[] arr = {1,7,4,5,6,2};
        int max= arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
               max=arr[i];

            }

        }

        System.out.println(max);
    }
}







