package STRING;

public class SubStringOfString {
    public static void main(String[] args) {
        String s="ishant";
        System.out.println(s.substring(3));
        System.out.println(s.substring(0,s.length()-1));
        for(int i=0;i<s.length();i++){
            for(int j=1+i;j<=s.length();j++){
               System.out.print(s.substring(i,j)+" ");
            }

        }
    }
    
}
