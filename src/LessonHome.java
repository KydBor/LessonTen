public class LessonHome {
    public static void main(String[] args) {
        String a = "I like Java!!!";

        System.out.println("charAt - " + a.charAt(10));
        System.out.println("endsWith - " + a.endsWith("!!!"));
        System.out.println("startsWith - " + a.startsWith("I like"));
        System.out.println("contains - " + a.contains("Java"));
        System.out.println("lastIndexOf - " + a.lastIndexOf("Java"));
        System.out.println("lreplace - " + a.replace("a", "o"));
        System.out.println("toUpperCase - " + a.toUpperCase());
        System.out.println("toUpperCase - " + a.toLowerCase());
        System.out.println("substring - " + a.substring(6, 11));
    }
}
