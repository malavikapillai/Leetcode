class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int pile:piles)
        {
            r=Math.max(r,pile);
        }
        
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(caneat(piles,mid,h))
            {
                r=mid;
                // can eat so try fro minimum
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
    }
    private boolean caneat(int[] piles,int mid,int h)
    {
        int actualhr=0;
        for(int x:piles)
        {
            actualhr+=x/mid;
            if(x%mid!=0)
            {
                actualhr++;
            }
            if(actualhr>h) return false;

        }
        return actualhr<=h;

    }
}