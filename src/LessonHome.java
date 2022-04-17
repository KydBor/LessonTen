public class LessonHome {
/*    public static void main(String[] args) {
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
    }*/

    public static void main(String[] args) {

        System.out.println(isPalindrom("Hello World abc toc sab cba aba bab rer olleH."));

    }
    private static boolean isPalindrom(String s){
        String s1 = s.toLowerCase().replaceAll("(^A-Za-z)", "");
        StringBuffer s2 = new StringBuffer(s1).reverse();
        boolean s3 = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                s3 = false;
                break;
            }
        }
        return s3;
    }
}
