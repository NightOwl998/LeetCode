List<Character> text1_list=new ArrayList<>();
List<Character> text2_list=new ArrayList<>();
for(int i=0;i<text1.length();i++)
{
text1_list.add(text1.charAt(i));
}
for(int i=0;i<text2.length();i++)
{
text2_list.add(text2.charAt(i));
}
List<Character> union=new ArrayList<>(text1_list);
union.retainAll(text2_list);
int prev=Integer.MIN_VALUE;
int counter=union.size();
System.out.println("the union  removing the characters that don't verify the conditions"+union);
​
for(int i=0;i<union.size();i++)
{   int m=text2_list.indexOf(union.get(i));
if(m<=prev) {union.remove(i); continue;}
text2_list.remove(m);
prev=m;
}
System.out.println("the union after removing the characters that don't verify the conditions"+union);
System.out.println("The string after blings"+text2_list);
​
return union.size();