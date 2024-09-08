import java.util.Scanner;
public class cal{
    public static void main(String[] args){
        int choice;
        do{
        System.out.println("----------------------------------");
        System.out.println("welcome to menu driven Calculator");
        System.out.println("----------------------------------");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        System.out.println("----------------------------------");
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
       
        if (choice >=1 && choice <5){
        System.out.print("Enter  the number1: ");
        double num1=input.nextDouble();
        System.out.print("Enter the number2: ");
        double num2=input.nextDouble();
        double ans;
        switch (choice){
           
            case 1:
                ans=num1+num2;
                System.out.println("The addition of two numbers is "+ ans);
                System.out.println("----------------------------------");
                break;
            case 2:
                ans=num1-num2;
                System.out.println("The subtraction of two numbers is "+ ans);
                System.out.println("----------------------------------");
                break;
            case 3:
                ans=num1*num2;
                System.out.println("The product of two numbers is "+ ans);
                System.out.println("----------------------------------");
                break;
            case 4:
                if(num2!=0){
                  ans=num1/num2;
                  System.out.println("The division of two numbers is "+ ans);
                  System.out.println("----------------------------------");}
                else{
                    System.out.println("Division by zero is infinity");
                    System.out.println("----------------------------------");
                }
                break;
          
        }
           
        }
        else{
            System.out.println("invalid choice");
            System.out.println("---------------");
        }
       
           
       
       
        }
        while(choice!=5);
        {
             System.out.println("Exiting program. Goodbye!");
             System.out.println("--------------------------");
        }  
   
 }

} 
