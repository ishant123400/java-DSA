package STRING;
public class StringBuilders {
    public static void main(String[] args) {
        // ArrayList<Character>str=new ArrayList<>();
        // str.add('a');
        // str.set(0,'b');
        // str.add('z');
        // System.out.println(str);


        StringBuilder s= new StringBuilder("ishant");
        System.out.println(s.length()+" "+s.capacity());
        s.append(" singh");
        System.out.println(s);
        s.setCharAt(0, 'h');
        System.out.println(s);
        String t=s.toString();
        System.out.println(t);


        s.append(" dhusbhjasbduywehdscbyufhjwedsncudasj");
System.out.println(s);
System.out.println(s.length()+" "+s.capacity());



    }
    
}
