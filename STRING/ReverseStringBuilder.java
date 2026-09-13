package STRING;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String p="ishant";
        StringBuilder s=new StringBuilder(p);
        

        s.reverse();
        System.out.println(s);

        //OR
        int i=0,j=s.length()-1;
        while(i<j){
            char temp1=s.charAt(i);
            char temp2=s.charAt(j);
            s.setCharAt(i, temp2);
            s.setCharAt(j, temp1);
            i++;
            j--;
        }
        System.out.println(s);


             
        }
    }
    

