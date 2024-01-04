class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
        {
            return false;
        }
        int peak = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > peak)
            {
                peak = arr[i];
                index = i;
            }
        }
        if (index == 0 || index == arr.length-1)
        {
            return false;
        }
        for (int i = 0; i < index; i++)
        {
            if (arr[i] >= arr[i+1])
            {
                return false;
            }
        }        
        for (int i = index+1; i < arr.length; i++)
        {
            if (arr[i] >= arr[i-1])
            {
                return false;
            }
        }    
        return true;
    }
}