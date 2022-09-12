package collectionExample.ArrayListExamples;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        List list4 = new ArrayList();

      //  List<Integer> list1 = new ArrayList<String>();  invalid statement

         //List list2 =new List();






       insertData(list);

//        List<Integer> result = insertDataWithoutArgument();
//
//        for (Integer value : result) {
//            System.out.println("Value::"+value);
//        }

    }

    //add()
    //remove()
    //size()
    //get
    //set
    //addAll()
    //removeAll





    private static void insertData(List<Integer> list) {

        for (int i = 1; i < 101; i++) {
            boolean response = list.add(i);
        }

        System.out.println("Filled size of ArrayList::"+list.size());

        /*for (Integer value : list) {
            System.out.println("Value::"+value);
        }*/


        System.out.println("Removing the element of ArrayList::"+list.remove(50));


        System.out.println("Removed the element of ArrayList::"+list.get(50)); //52

        Integer result=  list.set(50,10000);

        System.out.println(result);

        System.out.println("Set the element of ArrayList::"+list.get(50));//10000

        Integer result1=  list.set(50,20000);

        System.out.println(result1); //10000

        System.out.println("Set the element of ArrayList::"+list.get(50));//20000


        List<Integer> listNew=new ArrayList<>();
        listNew.addAll(list);

        List<Integer> listNew2=new ArrayList<>(list);

        List<Integer> listNew3= Arrays.asList(1,2,3,4,5,6,7,8,9,0);

       boolean status= listNew.removeAll(listNew3);

        System.out.println(status);



        for (Integer value : listNew) {
            System.out.println("Value::"+value);
        }






    }

    private static List<Integer> insertDataWithoutArgument() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            boolean response = list.add(i);
        }



        return list;
    }
}
