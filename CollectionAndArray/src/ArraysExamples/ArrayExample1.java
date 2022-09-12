package ArraysExamples;

public class ArrayExample1 {

    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        //  iteratingAndSetting(array);
        //print the index of 10 ;
        try {
            findIndexData(array, 101);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        findIndexData(null, 10);


    }

    private static void iteratingAndSetting(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (Integer value : array) {
            if (value % 2 == 0) {
                System.out.println("Even numbers::" + value);
            }
        }

    }


    private static Integer findIndexData(Integer[] array, Integer index) {
        if (null != array) {
            if (array.length > index) {
                return array[index];
            } else {
                throw new RuntimeException("Index does not found.Please provide proper for further processing....");
            }
        } else {
            throw new RuntimeException("Array does not found.Please provide array for further processing....");
        }

    }


    //insert the value in array of size of any size

    // and after only print even number
}
