class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list= new ArrayList<>();
        backtrack(s,list, new ArrayList<String>(),0);
        return list;
        
    }
    public void backtrack(String s, List<List<String>> list,List<String> tempList,int start)
    {
        if(start==s.length())
        {
            list.add(new ArrayList<>(tempList));
        }
        else
        { 
           for(int i=start;i<s.length();i++)
           {
               if(isPalindrome(s,start,i))
               {
                   tempList.add(s.substring(start,i+1));
                   backtrack(s,list,tempList,i+1);
                   tempList.remove(tempList.size()-1);
               }
               
           }
        }
    }
    public boolean isPalindrome(String s, int low,int high)
    {
        while(low<high)
        {
            if(s.charAt(low++)!=s.charAt(high--)) return false;
            
        }
        return true;
    }
}