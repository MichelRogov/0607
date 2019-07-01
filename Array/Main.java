import java.util.HashMap;

@SuppressWarnings("Duplicates")
public class Main {

    public static void main(String[] args) {

        Array arr = new Array();
        Array arr2 = new Array();
        Array initArr = new Array(2);
        Array initArr2 = new Array(2);

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(initArr);
        System.out.println(initArr2);

        HashMap<Array, String> hashMap = new HashMap<>();
         hashMap.put(arr, "Array 1");

        System.out.println("Hashcode Array 1 : " + arr.hashCode());
        System.out.println("Hashcode Array 2 : " + arr2.hashCode());

        System.out.println(hashMap.get(arr));

        System.out.println(hashMap.get(arr2));

        arr.add(1);
        System.out.println("Hashcode Array 1 : " + arr.hashCode());
        System.out.println("Hashcode Array 2 : " + arr2.hashCode());

        System.out.println(hashMap.get(arr));

        System.out.println(hashMap.get(arr2));

        System.out.println(arr.getSize());

    }
}
