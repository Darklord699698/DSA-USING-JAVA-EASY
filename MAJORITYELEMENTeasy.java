class MAJORITYELEMENTeasy {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                candidate=nums[i];
                count=1;
            }
        }
        count=0;
        for(int num:nums){
            if(num==candidate){
                count++;
            }
        }
        return candidate;
    }
}