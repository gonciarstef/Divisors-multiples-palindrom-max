import java.time.LocalDateTime;
import java.util.Scanner;

public class Main{

    public static int whichExercise(){
        System.out.println("\n---------------\n" +
                "Which exercise do you want to do now?\n" +
                "1 - Find the divisors of a number\n" +
                "2 - Find the multiples of a number\n" +
                "3 - Verify if a word is a palindrom\n" +
                "4 - Find the maximum of 5 numbers\n" +
                "5 - Exit");
        Scanner scan = new Scanner(System.in);

        return scan.nextInt();
    }

    public static String getString(){
        System.out.println("What is the word:");
        Scanner scan = new Scanner(System.in);

        return scan.nextLine().trim().toLowerCase();
    }

    public static int getInt(){
        System.out.println("What is the number:");
        Scanner scan = new Scanner(System.in);

        return scan.nextInt();
    }

    public static void findDivisors(int num){
        System.out.print("The divisors of number " + num + " are: ");

        for (int i = 1; i <= num ; i++) {
            System.out.print(((num % i) == 0) ? (i+" ") : "");
        }
    }

    public static void findMultipliers(int num){
        System.out.print("There is an infinite number of multiples of a number.\n  How many do you need now: ");

        Scanner scan = new Scanner(System.in);
        int howMany = scan.nextInt();

        System.out.printf("The first %s multiples of number %s are: ", howMany, num);

        for (int i = 0; i <= howMany ; i++) {
            System.out.print(num * i + " ");
        }
    }

    public static void findMaximum(){

        System.out.println("Which are the 5 numbers separated by one empty space: ");

        Scanner scan = new Scanner(System.in);
        int maxNr = scan.nextInt();
        for ( int i = 0 ; i < 4; i++) {
            maxNr = Math.max(maxNr, scan.nextInt());
        }
        System.out.println("The maximum is " + maxNr);
    }

    public static String reverseString(String string){
        char[] ch = string.toCharArray();
        String reverse ="";
        for (int i = ch.length-1; i >= 0 ; i--) {
            reverse += ch[i];
        }
        System.out.println("The reverse is: "+ reverse);
        return reverse;
    }

    public static void checkPalindrom(){
        String initialString = getString();
        String reverse = reverseString(initialString);
        System.out.println("The word " + (initialString.equals(reverse) ? "IS": "is NOT") + " a palindrom.");
    }

    public static void main(String[] args) {

        String s = 0+1+"ONE"+3+2+"TWO"+"THREE"+5+4+"FOUR"+"FIVE"+5;
        System.out.println(s);


        LocalDateTime DataSiOra = LocalDateTime.now();
        System.out.println(DataSiOra);
        long start = System.nanoTime();
        Integer x= new Integer(5); // rezultat 3500
        long start2= 5; // rezultat 2600
        System.out.println("1: " + (System.nanoTime() - start));
        System.out.println("2: " + (System.nanoTime() - start2));

        OtherExercises.findMiddleChar(OtherExercises.str1);
        OtherExercises.findMiddleChar(OtherExercises.str2);

        OtherExercises.findNumberOfDigits(OtherExercises.str1);

        System.out.print("Caracterul din mijloc este: " +OtherExercises.mijloc("Alabala portocala tralala")+"\n");



        int option;

        do {
            option = whichExercise();

            if(option == 1){  findDivisors(getInt());  }

            if(option == 2){  findMultipliers(getInt());   }

            if (option == 3){   checkPalindrom();   }

            if (option == 4){   findMaximum();   }

        }while (option != 5);

    }

}