package OOPS;

class pokemon{
    private int power;
    String types;
    pokemon(String types,int power){
              this.types=types;
              this.power=power;

    }
    pokemon(int power,String types){
              this.types=types;
              this.power=power;
    
}
   void print(){
    System.out.println(this.types+" "+this.power);
}
}
public class RevisionOOPS {
    public static void main(String[] args){
        pokemon pikachu=new pokemon("electric",70);
        pikachu.types="fire";
        // pikachu.power=80; //error dega
        pokemon jigglypuff=new pokemon(30,"fairy");
          pikachu.print();   jigglypuff.print();
    }
}
