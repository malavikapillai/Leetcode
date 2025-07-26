class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0;
        int j=0;
        int pos=0;
        
        for(String s: commands)
        {
            if(s.equals("RIGHT"))
            {
                j++;
            }
            else if(s.equals("LEFT"))
            {
                j--;
            }
            else if(s.equals("DOWN"))
            {
                i++;
            }
            else
            {
                i--;
            }
            pos=(i*n)+j;

        }
        return pos;
        
        
        
    }
}