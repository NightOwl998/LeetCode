class Solution {
    public String intToRoman(int num) {
        String res="";
        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
        
        for (Map.Entry<Integer, String> set :
             map.entrySet()) {
            
            if(num/set.getKey() > 0) 
            {   
                for (int j=0;j<num/set.getKey();j++) 
                 {
                         res= res+set.getValue();
                 }
                num=num-(set.getKey()*(num/set.getKey()));
            }
           
        }
    
        return res;
        
        
       
        
        
    }
}