import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int [] arr={4,1,2,1,2};
        int a=singleNumber(arr);
        System.out.println(a);
    }
    public static int singleNumber(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        ArrayList<Integer> clone=new ArrayList<>();
        for (Integer i:nums){
            hashSet.add(i);
            clone.add(i);
        }
        ArrayList<Integer> integers=new ArrayList<>();
       integers.addAll(hashSet);
       integers.addAll(hashSet);
       System.out.println();
       for (Integer i:clone){
           integers.remove(i);
       }
       return integers.get(0);
    }
}
