package mapExamples.customClasses.case2_changeValueInCustomObject;

import mapExamples.customClasses.case1_withoutHashCodeAndEquals.Product;

import java.util.HashMap;
import java.util.Map;

public class TestCatalog {

    public static void main(String[] args) {
        Catalog catalog = new Catalog(1, "Soap");
        Catalog catalog2 = new Catalog(2, "Toy");
        Catalog catalog3 = new Catalog(2, "Toy");

        Map<Catalog, String> map = new HashMap<>();
        map.put(catalog, "A");
        map.put(catalog2, "B");//what will be size
        map.put(catalog2, "D");//what will be size
        map.put(catalog3, "C");//what will be size

        catalog2.setName("ABC");

        System.out.println(map);


    }
}
