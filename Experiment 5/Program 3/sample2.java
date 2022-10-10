package sample_2;
import sample_1.*;
class sample2 extends sample1
{
    public static void main(String[]args)
    {
        sample2 obj=new sample2();
        obj.display();
        try{
            obj.display1();
           
        }
        catch(Exception e)
        {
            System.out.println("default property cannot be displayed");
        }
       
}

    private void display1() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
