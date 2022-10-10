package main;
import book.Books;
import journal.Journaldetails;

public class controlpackage {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Books b=new Books("PRISON BREAK","WENTWORTH MILLER",2000,"abc publications",200);
        Journaldetails j=new Journaldetails(1000,"FORBES",2020);
        b.show();
        j.show1();

    }
}
