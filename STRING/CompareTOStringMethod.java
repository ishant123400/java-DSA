package STRING;

public class CompareTOStringMethod {
    public static void main(String[] args) {
        String s="Ishant";
        String p="Singh";
        System.out.println(s.compareTo(p));
        String l="ishant";
        String x="singh";
        System.out.println(l.compareTo(x));
        String z="ishantsingh";
        String y="ishant";
        System.out.println(z.compareTo(y));
    }
    
}
