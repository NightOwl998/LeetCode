String number=Integer.toString(num);
//String[] number_array=number.split("");
//System.out.println("the array is2 "+number_array);
List<Integer> num_arr=new ArrayList<>();
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
for(int i=0;i<number.length();i++)
{   int element=Character.getNumericValue(number.charAt(i));
//System.out.println("the array is2 "+Character.getNumericValue(number.charAt(i)));
num_arr.add(element);
if(element>max) max=element;
if(element<min) min=element;
//create the integer array
int length = String.valueOf(num).length();
int[] nums=new int[length];
for(int i=0;i<length;i++)
{  String el=String.valueOf(num);
nums[i]=Integer.parseInt(String.valueOf(el.charAt(i)));
}
List<List<Integer>> list=new ArrayList<>();
backtrack(nums,list,new ArrayList<>());
return num;
}
public void backtrack(int[] nums,List<List<Integer>> list,List<Integer> tempList)
{
if(tempList.size()==nums.length)
{
list.add(tempList);
}
else
{
for(int i=0;i<nums.length;i++)
{
if(tempList.contains(nums[i])) continue;
tempList.add(nums[i]);
backtrack(nums,list,tempList);
tempList.remove(tempList.size()-1);
}
}