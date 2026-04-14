class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];

        HashMap<Integer,Integer> h=new HashMap<>();

        int i=0;

        for(Integer x:nums){
            if(h.containsKey(target-x)){
                a[0]=h.get(target-x);
                a[1]=i;
            }

            else{
                h.put(x,i);
            }
            i++;
        }
         
         return a;
    }   
}