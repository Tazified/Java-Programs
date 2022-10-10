package journal;

public class Journaldetails {
    int journalid;
    String journalname;
    int journaledition;
    public Journaldetails( int journalid,String journalname,int journaledition){
        this.journalid=journalid;
        this.journalname=journalname;
        this.journaledition=journaledition;
    }
    public void show1(){
        System.out.println("journal id"+journalid);
        System.out.println("journal name"+journalname);
        System.out.println("journal edition"+journaledition);

    }
}
