import java.util.Scanner;

public class Javabasics {
    public static void Hello(){
        System.out.print("hello world from the hello function");
    }
    public static void sumation(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("ENter a number:");
       int a = scanner.nextInt();
       System.out.print("EWNter your another value:");
       int b = scanner.nextInt();
       System.out.println("the sumation of two numbers is :" + (a+b));}

    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);

    //    System.out.print("EEnter the first number:");
    //    int a = scanner.nextInt();

    //    System.out.print("enter the value of the second number");
    //    int b= scanner.nextInt();

    //    int area= a*b;
    //    System.out.println("the area of of rectangle is:" + area);

    //    int $ =24;
    //    System.out.println($);

    // System.out.print("Enter your age:");
    // int age = scanner.nextInt();
    // if(age>=19){
    //     System.out.println("You are eligible ot vote and you are an adult");
    // }
    // else if(age>=13 && age<19){
    //     System.out.println("Sorry you cannnot vote are a teenager brother now fck opff");
    // }
    // else {
    //     System.out.printf("You are a baby fckk off bitch:");
    // }
    // System.out.print("Enter the number to to get it reversed:");
    // int n =scanner.nextInt();
    // int remainder;
    // while(n!=0){
    //     remainder = n%10;
    //     System.out.print(remainder);
    //     n=(int)n/10;

    // }



    // System.out.print("ENter your number to check if it is prime or not");
    // int n = scanner.nextInt();
    // boolean isPrime = true;
    
    // if(n <= 1){
    //     isPrime = false;
    // } else {
    //     for(int i = 2; i <=(0.5*n); i++){
    //         if(n % i == 0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    // }
    
    // if(isPrime){
    //     System.out.print("the number is prime");
    // }else{
    //     System.out.print("The number is Composite.");
    // }   


    //star patern
    // for(int i=0;i<=5;i++){
    //     for(int j=1;j<i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }
    
    // char ch='A';
    // for(int i=0;i<5;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(ch);
    //         ch++;
    //     }
    //     System.out.println();
    // }

    // Hello(); System.out.println();
    // sumation();
    int fact=1;
    System.out.print("enter the number n : ");
    int n = scanner.nextInt();
    for (int i=1;i<=n;i++){
        if(n==0 || n==1){
            System.out.println("THe factorial of the number is 1");
        }else{
            fact=fact*i;
        }
    }
    System.out.println("The factorial of " + n + " is: " + fact);
    System.out.print("ENter the value of r:");
    int r = scanner.nextInt();
    int num=1;
    for(int i=1;i<=r;i++){
       if(r==0 || r==1){
        System.out.println("THe factorial of specifoc r will be 1");
       }else{
         num = num*i;
       }
    }
    //factorial for n-r 
    int x=n-r;
    int sec = 1;
    for(int i=1;i<=x;i++){
        sec=sec*i;
    }
    
    int bino = fact/(num*sec);

    System.out.println("The value of the binomial coefficient C(" + n + ", " + r + ") is: " + bino);
    }
}