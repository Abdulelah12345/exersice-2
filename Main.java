import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
    /*1.Write a program that checks the role of the user
If the role is admin print "welcome admin"
If the role is superuser print "welcome superuser"
If the role is user print "welcome user" (tip:
use if else) */
Scanner sc = new Scanner(System.in);
int n;

        System.out.println("Enter Your Role: ");
        System.out.println("1-admin , 2-superuser , 3-use");
        n=sc.nextInt();
        if(n==1){
            System.out.println("welcome admin");
        }else if(n==2){
            System.out.println("welcome superuser");
        }else if(n==3){
            System.out.println("welcome user");

        }else{
            System.out.println("invalid input");
        }


/*2.Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output : The
greatest: 87*/

 int number1,number2,number3;
        System.out.println("Enter The First number");
        number1= sc.nextInt();
        System.out.println("Enter The Second number");
        number2= sc.nextInt();
        System.out.println("Enter The Third number");
        number3= sc.nextInt();
        if(number1>number2)
        {
            if(number1>number3){
                System.out.println("The greatest: "+number1);
            }
        }
        if(number2>number1)
        {
            if(number2>number3){
                System.out.println("The greatest: "+number2);
            }
        }
        if(number3>number2)
        {
            if(number3>number1){
                System.out.println("The greatest: "+number3);
            }
        }

        /*3.Write a Java program that generates an integer between 1 and 7
and displays the name of the weekday.
Test Data
number: 4
Expected Output:
Wednesday*/
        int random = (int)(Math.random() * 7);

        switch (random){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");



        }

        /*4. Write a program that takes a numeric score as input and prints
the corresponding letter grade using the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69 F:
0-59
Enter your numeric score: 85
Numeric Score: 85
Letter Grade: B */
        int score;
        System.out.println("Enter Your numeric score:  ");
        score=sc.nextInt();
        if(score>=90){
            System.out.println("A");
        }else if(score>=80&&score<90){
            System.out.println("B");
        } else if (score>=70&&score<80){
            System.out.println("C");


        }else{
            System.out.println("0");
        }

        /*5. Write a Java program that takes a person's age as input and
categorizes them into one of three age categories: "Child,"
"Teenager," or "Adult" using an if statement.
use an if statement to categorize the age based on the following criteria:
• If the age is less than 13, categorize them as a "Child."
• If the age is between 13 and 19 (inclusive), categorize them as a
"Teenager."
• If the age is 20 or older, categorize them as an "Adult."
Sample Output:
Enter your age: 25
You are an Adult. */
        int age;
        System.out.println("Enter Your Age: ");
        age=sc.nextInt();
        if(age<13){
            System.out.println("You Are A Child ");

        }else if(age>13&&age<=19){
            System.out.println("You are a Teenager");

        }else{
            System.out.println("You are an Adult");

        }

    }
}