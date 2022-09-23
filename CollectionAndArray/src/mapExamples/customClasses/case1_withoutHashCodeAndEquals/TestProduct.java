package mapExamples.customClasses.case1_withoutHashCodeAndEquals;

import java.util.HashMap;
import java.util.Map;

public class TestProduct {
    public static void main(String[] args) {

        //immutable classes  (Read it properly),clone()
        Product product = new Product(1, "Soap", 25.0);
        Product product2 = new Product(2, "Toy", 50.0);//100 byte-->10001
        Product product3 = new Product(2, "Toy", 50.0);//100 byte--->1000

        Map<Product, String> map = new HashMap<>();
        map.put(product, "A");
        map.put(product2, "B");//what will be size
        map.put(product2, "D");//what will be size
        map.put(product3, "C");//what will be size

      //equal methods
//      System.out.println("product2.equals(product2)::" + product2.equals(product2));//op: true
//      System.out.println("product.equals(product2)::" + product.equals(product2));//op:false
//      System.out.println("product.equals(product2)::" + product2.equals(product3));//op:false
//
//        //hashcode methods
//       System.out.println("Product hashcode::" + product.hashCode());//op:
//       System.out.println("Product2 hashcode::" + product2.hashCode());//op:
//       System.out.println("Product3 hashcode::" + product3.hashCode());//op:

        //Size
      System.out.println("Size of Map::" + map.size()); //wta will be size
     System.out.println("Printing the map::"+map);
     // System.out.println(map.get(product3));
    }
}

//if equals method is not override then equality check will happen on the basis of reference.
//if hashcode method is not overridden then check address of object if address is same then hashcode will also be same in that case.
