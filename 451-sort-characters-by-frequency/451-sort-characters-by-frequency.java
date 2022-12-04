class Solution {
    public String frequencySort(String s) {
       
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i))) map.replace(s.charAt(i),map.get(s.charAt(i))+1); 
            else map.put(s.charAt(i),1);
        }
        //System.out.println("the map is"+map);
        
        String res="";
        while(!map.isEmpty())
        {
            Character key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            for(int i=0;i<map.get(key);i++)
            {
                 res=res+key;
            }
           
            map.remove(key);
            
        }
        
      /*  for(Map.Entry<Character,Integer> frequency:map.entrySet())
        {
            for(int j=0;j<frequency.getValue();j++)
            {
                res=res+frequency.getKey();
            }
        }*/
        return res;
    }
}