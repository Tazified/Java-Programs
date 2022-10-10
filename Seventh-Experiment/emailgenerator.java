package email;
import java.util.Scanner;
class convert{
    String f_name;
    String s_name;
    convert(String f_name,String s_name){
        this.f_name= f_name;
        this.s_name=s_name;

    }
    void display(){
        String s1;
        String s2;
        try{
        s1=f_name.substring(0,3);
        s2=s_name.substring(0,4);
        System.out.println("generated email "+s1+"."+s2+"@gmail.com");
        }
        catch(Exception e){
            System.out.println(e);    
        }

    }
}

public class Email {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first name");
        String f_name=sc.next();
        System.out.println("enter the last name");
        String s_name=sc.next();
        convert c=new convert(f_name,s_name);
        c.display();
        sc.close();

    }
}
