package OOPS;
class pokemon{
      int power;
      String types;
      pokemon(){

      }
     pokemon(String types,int power){
        this.power=power;
         this.types=types;
    }
    void print(){
        System.out.println(this.power+" "+this.types+" ");
    }
}
class strongpokemon extends pokemon{
    int speed;
}
class lagendarypokemon extends pokemon{
    String ability;
}
class powerpokemon extends lagendarypokemon{
    int extraspeed;
}
public class Inheritance {
    public static void main(String[] args) {
        strongpokemon s1= new strongpokemon();
        s1.speed=210;
          lagendarypokemon l1=new lagendarypokemon();
          l1.ability="danger";
          s1.print();
          System.out.println(s1.speed);
          powerpokemon p1=new powerpokemon();
          p1.extraspeed=10;

    }
    
}
