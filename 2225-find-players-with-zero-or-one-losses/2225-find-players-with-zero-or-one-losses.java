class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
      
       
        HashMap<Integer,Integer> map=new HashMap<>(); // a map of each team and their loses respectively.
        List<List<Integer>> results= new ArrayList<>();
        List<Integer> sub= new ArrayList<>();
        List<Integer> sub_= new ArrayList<>();
        for(int i=0;i<matches.length;i++)
        { 
            if(!(map.containsKey(matches[i][0])))  
        { 
            map.put(matches[i][0],0);
        }
       
         if(!map.containsKey(matches[i][1])) 
         {
             map.put(matches[i][1],0);
         }
        
          
          map.put(matches[i][1],map.get(matches[i][1])+1) ;
         
        }
        for (Integer key: map.keySet())
        {
            if(map.get(key)==0) // The teams hasnot lost anything
            {
                sub_.add(key);
            }
            if(map.get(key)==1) // the teams that lost exactly one match 
            {
                sub.add(key);
            }
        }
        
        Collections.sort(sub_);
        Collections.sort(sub);
        results.add(sub_);
        results.add(sub);
        
        return results;
        
    }
}