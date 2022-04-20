import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        List aList = new ArrayList();
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll");
        scottishIslands.add("Tiree");

        //int position1 = scottishIslands.indexOf("Skye");
        //System.out.println("Index of Skye");
        //System.out.println(aList.indexOf("Skye"));

        scottishIslands.remove("Tresco");
        System.out.println(scottishIslands);

        scottishIslands.remove(5);
        System.out.println(scottishIslands);

        System.out.println(scottishIslands.size());

        Collections.sort(scottishIslands);
        for (String i : scottishIslands) {
            System.out.println(i);
        }


        //String removedStr = scottishIslands.remove(1);
        //System.out.println(scottishIslands);
        //System.out.println(removedStr);

//        1. Add "Coll" to the end of the list
//        2. Add "Tiree" to the start of the list
//        3. Add "Islay" after "Jura" and before "Mull"
//        4. Print out the index position of "Skye"

        int skyeIndex = scottishIslands.indexOf("Skye");
        System.out.println("Skye index: " + skyeIndex);


//        5. Remove "Tresco" from the list by name
//        6. Remove "Arran" from the list by index
//        7. Print the number of islands in your arraylist
//        8. Sort the list alphabetically
//        9. Print out all the islands using a for loop
        for (int i = 0; i < scottishIslands.size(); i++){
            System.out.println((scottishIslands.get(i)
            ));
        }


        System.out.println(scottishIslands);









//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);


        {


        }

        int a,b, result;
                a = 99;
                b = 1;

                result = a-b;
        System.out.println(result);




        }

    int minNumber = Collections.min(numbers);
    int maxNumber = Collections.max(numbers);

    boolean isContains = false;
    for (int i = 0)
}

//        1. Print out a list of the even integers

//        2. Print the difference between the largest and smallest value




//        3. Print true if the list contains a 1 next to a 1 somewhere

for (int i = 0; i < numbers.size())
//        4. Print the sum of the numbers
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.





