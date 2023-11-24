class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++)
        {
            int n = image[0].length-1;
            int []arr = new int[image[0].length];
            for(int j = 0; n>=0; j++)
            {
                if(image[i][j]==0)
                {
                    image[i][j]=1;
                    arr[n--]=image[i][j];
                }
                else
                {
                    image[i][j]=0;
                    arr[n--]=image[i][j];
                }
            }
            image[i]=arr;
        }
        return image;
    }
}