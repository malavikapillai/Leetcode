class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int srow=0;
        int erow=m-1;
        int scol=0;
        int ecol=n-1;
        while(srow<=erow && scol<=ecol)
        {
            for(int j=scol;j<=ecol;j++)
        {
            list.add(matrix[srow][j]);
        }
        for(int i=srow+1;i<=erow;i++)
        {
            list.add(matrix[i][ecol]);
        }
        for(int j=ecol-1;j>=scol;j--)
        {
            if(srow==erow)
            {
                break;
            }
            list.add(matrix[erow][j]);
        }
        for(int i=erow-1;i>=srow+1;i--)
        {
            if(scol==ecol)
            {
                break;
            }
            list.add(matrix[i][scol]);
        }
        srow++;
        erow--;
        scol++;
        ecol--;


        }

        
        return list;

        
    }
}