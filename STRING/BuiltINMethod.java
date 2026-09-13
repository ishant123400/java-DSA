package STRING;

import java.nio.channels.Pipe.SourceChannel;

public class BuiltINMethod {
    public static void main(String[] args) {
        String s="Ishant singh";
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('h'));
        System.out.println(s.indexOf(' '));
        System.out.println(s.lastIndexOf('h'));
        System.out.println(s.indexOf('I'));
        System.out.println(s.indexOf('z'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());


        System.out.println(s.contains("Isha"));
        System.out.println(s.contains("Ishat"));

        System.out.println(s.startsWith("Ishan"));
        System.out.println(s.startsWith("ant"));
        System.out.println(s.endsWith("gh"));

        s=s.toUpperCase();
        System.out.println(s);
    
    }
    
}
