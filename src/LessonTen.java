import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class LessonTen {
    public static void main(String[] args) {
        //CTRL + P
//        String a = new String("a;sfdgdsf;sfsddsf");
        String a = "Hello World";
        String b = "Hello World";
        System.out.println("equals() - " + a.equals(b));
        System.out.println("getBytes() - " + Arrays.toString(a.getBytes(StandardCharsets.UTF_8)));
        System.out.println("toLowerCase() - " + a.toLowerCase());
        System.out.println("toUpperCase() - " + a.toUpperCase());
        System.out.println("charAt() - " + a.charAt(0));
        System.out.println("compareTo() - " + a.compareTo(b));
        System.out.println("concat() - " + a.concat(b));
        System.out.println("endsWith() - " + a.endsWith("ld"));
        System.out.println("length() - " + a.length());
        System.out.println("replace() - " + a.replace("l", "q"));
        System.out.println("split() - " + Arrays.toString(a.split(" ")));
        System.out.println("substring() - " + a.substring(2));
        String c = "            Hello World                ";
        System.out.println(c);
        System.out.println("trim() - " + c.trim());
        System.out.println("==============================");
        StringBuilder d = new StringBuilder("Hello World");
        System.out.println(d.append("123").append("saddsf").append("hgnjmhh"));
    }
}
