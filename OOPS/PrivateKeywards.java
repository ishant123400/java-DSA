package OOPS;
 class Students{
    String name;// inital diffault value null store raheaga
    private int rno;// 0
    double cgpa;//0.0
    // print fxn is also private we use new fxp that call print
   private void print(){ // called getter
        System.out.println(name+" "+rno+" "+cgpa);
    }
    public void hi(){// called getter
        print();
    }
    // if we set the rno the use call fxn
    void rnoset(int x){ //setter
        rno=x;
    }
}

public class PrivateKeywards {
public static void main ( String [] args){
    Students s1=new Students ();
    s1.hi();
      s1.name="ishant";
      // private rno cannot access public 
     // s1.rno=12;
     s1.rnoset(45);
     s1.cgpa=4.6;
     s1.hi();

}
    
}
