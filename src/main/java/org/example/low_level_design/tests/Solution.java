package org.example.low_level_design.tests;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        List<Integer> list=new ArrayList ();

        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.remove (i);
        }
        return result;
    }
}