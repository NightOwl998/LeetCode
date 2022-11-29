class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
      
        //Split the list [winneri,loseri] to two lists [winner1,winneri] and the second list is the losers 
        List<Integer> winners=new ArrayList<>();
        List<Integer> losers=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        List<List<Integer>> results= new ArrayList<>();
        List<Integer> sub= new ArrayList<>();
        List<Integer> sub_= new ArrayList<>();
        for(int i=0;i<matches.length;i++)
        { if(!(map.containsKey(matches[i][0])))  
        { 
            map.put(matches[i][0],0);
        }
        /* else
         {
          int new_value=map.get(matches[0])+1;
          map.put(matches[0],new_value) ;
         }*/
         if(!map.containsKey(matches[i][1])) 
         {
             map.put(matches[i][1],0);
         }
        
          int new_value=map.get(matches[i][1])+1;
          map.put(matches[i][1],new_value) ;
         
        }
        for (Integer key: map.keySet())
        {
            if(map.get(key)==0) // hasnot lost anything
            {
                sub_.add(key);
            }
            if(map.get(key)==1) // lost exactly one match 
            {
                sub.add(key);
            }
        }
        /*List<List<Integer>> results= new ArrayList<>();
        for(int i=0;i<matches.length;i++)
        {
             
            winners.add(matches[i][0]); //this is the winner
            losers.add(matches[i][1]);
        }
         List<Integer> sub= new ArrayList<>();
             List<Integer> sub_= new ArrayList<>();
        for(int i=0;i<losers.size();i++)
        {
            if(Collections.frequency(losers,losers.get(i))==1)
            {
               sub.add(losers.get(i));
            }
            if(!losers.contains(winners.get(i)) && !sub_.contains(winners.get(i)))
            {
                sub_.add(winners.get(i));
            }
           
            
        }*/
        Collections.sort(sub_);
        Collections.sort(sub);
        results.add(sub_);
        results.add(sub);
        
        return results;
        
    }
}