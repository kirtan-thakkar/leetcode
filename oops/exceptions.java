import java.util.*;

class ageExp extends Exception {

        ageExp(String msg) {
            super(msg);
        }
    }
public class exceptions {
        static void checkAge(int age) throws ageExp {
            if (age < 18) {
                throw new ageExp("age is less to vote fkk off");
            } else {
                System.out.println("Good for you you ccan go and vote");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter age of yours mother fucker");
            int age = sc.nextInt();

            try {
                checkAge(age);
            } catch (ageExp e) {
                System.out.println("Caught custom exception" + e.getMessage());
            }
        }
}

class main{
    public static void main(String[] args){
        try {
            int result = 1/0;
        } catch (Exception e) {
            System.out.println("Custom message" + e.getMessage());
        }
    }
}