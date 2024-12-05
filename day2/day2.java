import java.util.*;
public class day2 {
    public static void main(String[] args) {
        

        //System.out.print("Hello");
         System.out.println("Hello hi"); 
         System.out.println("Hello");

         //print -> show output in same line
         //println -> show output in new line 
         System.out.print("Hello hi "); 
         System.out.print("Hello");

         // \n ->new line
         System.out.println("Hello \n how are you"); 

         


        //example1-> print stars as given below
        /*

        *
        **
        ***
        ****

        */
       for(int i = 1;i<5;i++){
            for(int j = 0 ;j<i;j++){
                System.out.print("*");
                
            }
            System.out.println("");
       }

       //--------------------------------------------------
       //Variables

       String name = "tony stark";
       int age = 48;
       double price = 50.25;

       //primitives -> int ,float, bool,char
       //non primitives -> string,array, list, objects

       //primitives = stores simple values like numbers,charcters,True/false
       //             fixed size and predefined by the language

       //non primitives = can store multiple values or data of different types
                     
        //-----------------------------------------

        //Taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String input_name = sc.nextLine();
        System.out.println("Enter the name "+input_name);


        //Example2-> take input and sum

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.print(a+b);

        //------------------------------------

        //Condtional statements
        // if -> same as c++ and same syntax
        // switch ->same as C++ and same syntax

        //-------------------------------------

        //loops
        //for loop -> same as c++ and same syntax
        // do while -> same as c++ and same syntax
        // while -> same as c++ and same syntax


        //example3
        /*
        *****
        *****
        *****
        *****
    
        */ 
       for(int i =1;i<5;i++){
            System.out.println("*****");
       }

        //example4
        /*

        *****
        *   *
        *   *
        *****
    
        */ 
       int m = 5;
       int  n = 5;

       for(int i =1;i<=m;i++){
            for(int j= 1;j<=n;j++){
                if(i==1 || j == 1 || i== m || j== n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
       }

    //  example5
    /*
        *
        **
        ***
        ****

    */
   int n = 4;
   for(int i =1;i<=n;i++){
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
   }

    //  example6
    /*
        ****
        ***
        **
        *

    */
   int n = 4;
   for(int i = 1;i<=n;i++){
        for(int j = n;j >=i;j--){
             System.out.print("*");
        }
        System.out.println();
   }
    //  example7
    /*
           *
          **
         ***
        ****      

    */
   int n =4;
   for(int i = 1;i<=n;i++){
        for(int j = 0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
   }


    // example 7
    /*
        1
        12
        123
        1234
        12345
    */
   int n = 5;
   for(int i =1;i<=n;i++){
        for(int j = 1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
   }

//  example 8
/*
    12345
    1234
    123
    12
    1
*/
   int n = 5;
   for(int i = 1;i<=n;i++){
        for(int j = n;j >=i;j--){
             System.out.print(n-j+1);
        }
        System.out.println();
   }


 



       
         



    }
}
