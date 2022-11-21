import java.util.List;
import java.util.ArrayList;

public class Main {



  //METODA 1

        public static void readIntsFromInputAndPrintItUntilNegative() {


            System.out.println("zadání 1");
            int input1;
            do {
                System.out.println("zadej celé číslo:");
                input1 = Support.safeReadInt();
                System.out.println("zadáno: "+input1);
            }
            while (input1>= 0);

        }


 //METODA 2
         public static int sumAllInputUntilNegative() {


             System.out.println("zadání 2");

             int input2=0;
             int sum2=0;

             while (input2>= 0) {

                 System.out.println("zadej celé číslo:");
                 input2 = Support.safeReadInt();


                 if (input2>= 0){

                     sum2 += input2;

                     System.out.println("součet zadaných čísel je:"+sum2);
                 }

             }
             return sum2;
         }


// METODA 3
    public static List<Integer> storeAllInputInArrayListUntilNegative() {

    System.out.println("zadání 3");


    int input3=0;
    List<Integer> listOfNumbers = new ArrayList<>();

        while (input3>= 0) {

        System.out.println("zadej celé číslo:");
        input3 = Support.safeReadInt();


        if (input3>= 0){

            listOfNumbers.add(input3);

            System.out.println(listOfNumbers);
        }

    }

        return listOfNumbers;
    }



//METODA 4
    public static void printAllIntegersFromList(List<Integer> listOfNumbers) {

        System.out.println("zadání 4 - výpis prvků listu pod sebou:");

        for (int i=0; i<=listOfNumbers.size()-1; i++) {

            System.out.println(listOfNumbers.get(i));

        }



    }

//METODA 5

    public static Integer sumAllIntegersFromList(List<Integer> listOfNumbers) {

        System.out.println("zadání 5 - součet prvků listu je:");

        int sum5=0;
        for (int i=0; i<=listOfNumbers.size()-1; i++) {

            sum5 += listOfNumbers.get(i);

        }
        System.out.println(sum5);


        return sum5;
    }


//METODA 6

    public static void printIntegersUnderLimit(List<Integer> listOfNumbers, int limit) {



        System.out.println("zadání 6");

        List<Integer> copyOfList = new ArrayList<Integer>(listOfNumbers); //vytvoření kopie listu


        for (int i=0; i<=copyOfList.size()-1; i++) {

            if (copyOfList.get(i)>=limit)
            {
                copyOfList.remove(i);
                i--;

            }
        }
        System.out.println(copyOfList);


    }

//METODA 7

    public static void printIntegersWithReplace(List<Integer> listOfNumbers) {

        System.out.println("zadání 7 - náhrada čísel 1, 2 a 3 v listu slovy");

        for (int i=0; i<=listOfNumbers.size()-1; i++) {

            if (listOfNumbers.get(i)==1 && i==listOfNumbers.size()-1) System.out.print("one.");
            else if (listOfNumbers.get(i)==1) System.out.print("one, ");

            else if (listOfNumbers.get(i)==2 && i==listOfNumbers.size()-1) System.out.print("two.");
            else if (listOfNumbers.get(i)==2) System.out.print("two, ");

            else if (listOfNumbers.get(i)==3 && i==listOfNumbers.size()-1) System.out.print("three.");
            else if (listOfNumbers.get(i)==3) System.out.print("three, ");

            else if (i<=listOfNumbers.size()-2) System.out.print(listOfNumbers.get(i)+", ");
            else System.out.print(listOfNumbers.get(i)+".");

        }


    }


// METODA MAIN

    public static void main(String[] args) {

        readIntsFromInputAndPrintItUntilNegative();
        System.out.println(" ");

        sumAllInputUntilNegative();
        System.out.println(" ");

        List<Integer> list = storeAllInputInArrayListUntilNegative();

        System.out.println(" ");
        System.out.println(list);
        printAllIntegersFromList(list);


        System.out.println(" ");
        System.out.println(list);
        sumAllIntegersFromList(list);


        System.out.println(" ");
        System.out.println(list);
        printIntegersUnderLimit(list, 5);

        System.out.println(" ");
        System.out.println(list);
        printIntegersWithReplace(list);

    }

}




