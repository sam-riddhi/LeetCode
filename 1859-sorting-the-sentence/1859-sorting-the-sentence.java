class Solution {
    public String sortSentence(String s) {
        String[] words  = s.split(" ");
        String[] arr = new String[words.length];
        
        for(String t : words)
        {
            int n = t.length();
            int pos = t.charAt(n-1)-48;
            arr[pos-1] = t.substring(0,n-1);            
        }
        StringBuilder sb = new StringBuilder();
        for(String t : arr)
        {
            sb.append(t);
            sb.append(" ");
        }
        return sb.toString().trim();
    }       
}