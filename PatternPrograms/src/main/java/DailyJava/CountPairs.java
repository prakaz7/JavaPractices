package DailyJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountPairs {
    public static void main(String[] args) {

        int target = 2;
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(countPairs(nums, target));

    }

        public static int countPairs(List<Integer> nums, int target) {
            Collections.sort(nums);
            int count =0;
            int start =0;
            int end = nums.size()-1;

            while(start<end){
                int sum = nums.get(start) + nums.get(end);
                if(sum<target){
                    count+= end-start;
                    start++;
                }else{
                    end--;
                }
            }
            return count;
        }
    }
