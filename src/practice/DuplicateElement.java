package practice;


import java.util.*;

public class DuplicateElement {
    public static void main (String[] args) {
        int[] nums={1,2,2,3,4,3,4,5,6,7};
        DuplicateElement de = new DuplicateElement();
        List duplicated = de.findDuplicated(nums);
        System.out.println("Duplicated Elements: "+duplicated);
    }

    private List<Integer> findDuplicated (int[] nums) {
        List<Integer> duplicated=new ArrayList<>();
        HashMap<Integer,Integer> numMap = new HashMap<>();
        Arrays.stream(nums).forEach(num->numMap.put(num,numMap.getOrDefault(num,0)+1));
        numMap.entrySet().stream().filter(entry-> entry.getValue()>1).forEach(entry->duplicated.add(entry.getKey()));
        return duplicated;
    }

//    private List<Integer> findDuplicated (int[] nums) {
//        List<Integer> duplicated=new ArrayList<>();
//        HashMap<Integer,Integer> numMap = new HashMap<>();
//        for(int num: nums){
//            numMap.put(num,numMap.getOrDefault(num,0)+1);
//        }
//        for(Map.Entry<Integer,Integer> entry: numMap.entrySet()){
//            if(entry.getValue()>1){
//                duplicated.add(entry.getKey());
//            }
//        }
//        return duplicated;
//    }
}
