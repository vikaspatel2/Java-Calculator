
import java.util.Scanner;
  //vikas here
 // Compiler version JDK 11.0.2
 class switch_case
 {
   public static void main(String args[])
   { 
     int a,b,c,ch;
    System.out.println("Enter two numbers:");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
  
     System.out.println("Enter your Choice");
    ch=s.nextInt();
     
      switch(ch)
      {
        case 1:c=a+b;
        System.out.println("Addition "+c);
         break;
        case 2:c=a-b;
          System.out.println("Subtraction"+c);
         break;
         case 3:c=a*b;
         System.out.println("Multiplication"+c);
         break;
         case 4:c=a/b;
         System.out.println("Division"+c);
         break;
         case 5:c=a%b;
         System.out.println("Remainder"+c);
           break;
        default :
       System.out.println("Enter the valid numer");
    
          }
   
   }
 }
 
