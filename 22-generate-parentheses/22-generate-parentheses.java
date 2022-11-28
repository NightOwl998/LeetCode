class Solution {
    public List<String> generateParenthesis(int n) {
        
        //generate permutaions
        String[] ensemble=new String[n*2];
        for(int i=0;i<n;i++)
        {
            ensemble[i]="(";
            
        }
         for(int i=n;i<2*n;i++)
        {
            ensemble[i]=")";
            
        }
        
        List<String> list= new ArrayList<>();
        backtrack(list,ensemble,new ArrayList<>(),new boolean[n*2]);
        List<String> result=new ArrayList<>();
        
        return list;
    }
    public void backtrack(List<String> list,String[] ensemble,List<String> tempList,boolean[] used)
    {
        if(tempList.size()==ensemble.length && isValideParenthese(tempList) )
        {
           String str=String.join("",tempList);
           list.add(str);
          // System.out.println("The tempList"+str);
        }
        else
        { 
            for(int i=0;i<ensemble.length;i++)
            {   if(used[i] || i>0 && ensemble[i]==ensemble[i-1] && !used[i-1]) continue;
                tempList.add(ensemble[i]);
                used[i]=true;
                backtrack(list,ensemble,tempList,used);
                used[i]=false;
                tempList.remove(tempList.size()-1);
            }
        }
    }
    public boolean isValideParenthese(List<String> elements)
    {  
        Stack<String> lifo=new Stack<String>();
        for(String element:elements)
        {
            if(element.equals("(")) lifo.push(element);
            if(element.equals(")") && !(lifo.isEmpty())) lifo.pop(); 
        }
        return lifo.isEmpty();
    }

    
}