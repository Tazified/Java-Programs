import java.util.*;
public class SearchStringInAList {
public static void main(String args[])
{
ArrayList<String> list = new ArrayList<String>();
list.add("Java");
list.add("OOPS");
list.add("Datastructure");
list.add("Maths");
list.add("Architecture");
list.add("Digitalprinciples");
//Search a String in a List
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string to be searched");
String search=sc.next();
boolean find = list.contains(search);
System.out.println("Is Java present in the list? "+find);
//Display all the Strings that begin with a given letter
System.out.println("Enter the beginning letter");
String begin=sc.next();
String letter = begin;
for(String str:list)
{
if(str.startsWith(letter))
{
System.out.println(str);
}
}
//Display all the Strings that end with a given letter
System.out.println("Enter the ending letter");
String end=sc.next();
letter = end;
for(String str:list)
{
if(str.endsWith(letter))
{
System.out.println(str);
}
}
}
}
