class Solution {
    
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean[] index= new boolean[n+1];
        index[0]=true;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(index[j] && wordDict.contains(s.substring(j,i)))
                {
                    index[i]=true;
                    
                }
            }
        }
        return index[n];
       /* if(wordDict.contains(s)) return true;
        for(int i=0;i<n;i++)
        {
            String first_word=s.substring(0,i);
            String second_word=s.substring(i,n);
            
            //System.out.println("word1: "+first_word+" word2: "+second_word);
            if(wordDict.contains(first_word) )
                {  set.add(first_word);
                   if(wordDict.contains(second_word) || second_word.length()==0)
                    {
                       
                      return true;   
                    }
                     
                      if(wordBreak(second_word,wordDict)) return true;              
                   
            }
                
        }*/
        
        
    }
}