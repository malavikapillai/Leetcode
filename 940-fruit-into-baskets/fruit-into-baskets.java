class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int max=0;
        while(right < fruits.length)
        {
            int item=fruits[right];
            if(map.containsKey(item))
            {
                int oc=map.get(item);
                map.put(item,oc+1);
            }
            else
            {
                map.put(item,1);
            }
            right++;
           
            while(map.size()>2)
            {
                int leftitem=fruits[left];
                int c=map.get(leftitem);
                map.put(leftitem,c-1);

                if(map.get(leftitem)==0)
                {
                    map.remove(leftitem);
                }
                left++;
            }

            max=Math.max(max,right-left);


        }
        return max;



        
    }
}