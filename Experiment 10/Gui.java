package gui;
import java.util.ArrayList;
import javax.swing.*;    
import java.awt.event.*;  
public class Gui {  
    public static void main(String[] args) { 
        ArrayList<String> arr1 = new ArrayList<String>(4); 
        ArrayList<Integer> arr2= new ArrayList<Integer>(4); 
        ArrayList<Integer> arr3 = new ArrayList<Integer>(4);
        ArrayList<String> arr4 = new ArrayList<String>(4);  
        //BOOKS
        arr1.add("sherlockholmes");
        arr1.add("dark");
        arr1.add("1917");
        arr1.add("gravity");
        //AMOUNT OF BOOKS
        arr2.add(100);
        arr2.add(150);
        arr2.add(750);
        arr2.add(999);
        //COPIES OF BOOKS
        arr3.add(45);
        arr3.add(30);
        arr3.add(20);
        arr3.add(25);
        //author
        arr4.add("xyz");
        arr4.add("abc");
        arr4.add("muthu");
        arr4.add("gowtham");
    JFrame f=new JFrame("BOOK");    
     final JLabel label = new JLabel();            
     label.setBounds(20,150, 200,50);  
     final JLabel label2 = new JLabel();   
     label2.setBounds(100,75,100,30);   
     JLabel l1=new JLabel("BOOK NAME:");    
        l1.setBounds(20,20, 80,30);    
        JLabel l2=new JLabel("AUTHOR:");    
        l2.setBounds(20,75, 80,30);    
        JButton b = new JButton("SUBMIT");  
        b.setBounds(100,120, 80,30);    
        final JTextField text = new JTextField();  
        final JTextField text1 = new JTextField();  
        text.setBounds(100,20, 100,30); 
        text1.setBounds(100,75, 100,30); 
        
                f.add(label2); f.add(l1); f.add(label); f.add(l2); f.add(b); f.add(text); f.add(text1);
                f.setSize(300,300);    
                f.setLayout(null);    
                f.setVisible(true);
                f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);     
               b.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) {       
                   String bookname=text.getText();
                   String authorname=text1.getText();
                   int n=arr1.indexOf(bookname);
                   if(arr1.contains(bookname)){
                    JOptionPane.showMessageDialog(f,"book is available");
                    JOptionPane.showMessageDialog(f,"\nbook name "+bookname+"\nauthor name "+authorname);
                  String  res = JOptionPane.showInputDialog("enter the required number of copies");
                    int copies=Integer.parseInt(res);
        
                    if(copies<= arr3.get(n))
                    JOptionPane.showMessageDialog(f,"total amount "+(arr2.get(n)*copies));
                    
                   }
                   else{
                    JOptionPane.showMessageDialog(f,"book is not available");
                   }
                } 
             });   
}  
} 
