public class OtherExercises {

   static String str1 = "Ana";
    static String str2 = "Dana";

    public static void findMiddleChar(String str){
        if(str.length() % 2 == 1){
            System.out.println(str.charAt(str.length()/2));
        } else{
            System.out.print(str.charAt(str.length()/2 -1));
            System.out.print(str.charAt(str.length()/2));
        }
    }


    //Scrie o metoda care numara cate cifre se afla intr-un sir de caracter.
    public static void findNumberOfDigits(String str){
        int counter = 0;
        for (int i=0; i< str.length(); i++){
            if (Character.isLetter(str.charAt(i)))  counter++;
        }
        System.out.println(counter);
    }

    //Scrie o metoda care returneaza ziua, ora si minutul la care programul a fost compilat.
    public static String mijloc(String str)
    {
        int pozitie;
        int lungime;
        if (str.length() % 2 == 0)
        {
            pozitie = str.length() / 2 - 1;
            lungime = 2;
        }
        else
        {
            pozitie = str.length() / 2;
            lungime = 1;

        }
        return str.substring( pozitie, pozitie + lungime); // substring returneaza o parte din sir
    }
}
