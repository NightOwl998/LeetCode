class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] parts=s.split("\\s");
        
        List<String> list=new ArrayList<>(Arrays.asList(parts));
        
        String res="";
        for(int i=list.size()-1;i>=0;i--)
        {  
          if(!(list.get(i).equals("")))
          { 
                         
                    
            res=res+list.get(i);
            if(i!=0)
            {
                res=res+" ";
            }
           }
            
        }
        return res;
        
        
    }
}