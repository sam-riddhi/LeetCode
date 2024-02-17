class Solution {
    public String interpret(String command) {
        StringBuilder s =new StringBuilder();
        int i = 0;
        int n = command.length();

        while(i<n)
        {
            char ch = command.charAt(i);
            if(ch=='G')
                s.append('G');
            else if(ch=='(')
            {
                if(command.charAt(i+1)==')')
                {
                    s.append("o");
                    i++;
                }
                else
                {
                    s.append("al");
                    i = i+3;
                }
            }
            i++;
        }
        return s.toString(); // to convert Steinbuilder object to String
    }
}