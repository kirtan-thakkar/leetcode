public class Majduri {
    public static void main(String s[]) {
        String s1 = "Hello";
        String s2 = new String("World");
        String s3 = "   Javaaaa   ";
        String s4 = "Python is better";

        System.out.println("length of s1: " + s1.length());
        System.out.println("char at index 2: " + s1.charAt(2));

        System.out.println("Unicode at 2: " + s1.codePointAt(2));
        System.out.println("Unicode before 2: " + s1.codePointBefore(2));
        System.out.println("Unicode total: " + s1.codePointCount(0, 0));

        String concat1 = s1 + " " + s2;
        String concat2 = s1.concat(" ").concat(s2);
        System.out.println("Concat (+): " + concat1);
        System.out.println("Concat (method): " + concat2);

        System.out.println("Equals: " + concat1.equals(concat2));
        System.out.println("EqualsIgnoreCase: " + s1.equalsIgnoreCase("hello"));
        System.out.println("CompareTo: " + s1.compareTo(s2));
        
        System.out.println("Substring (2): " + s1.substring(2));
        System.out.println("Substring (2, 4): " + s1.substring(2, 4));
        
        System.out.println("IndexOf 'l': " + s1.indexOf('l'));
        System.out.println("LastIndexOf 'l': " + s1.lastIndexOf('l'));
        System.out.println("Contains 'ell': " + s1.contains("ell"));
        System.out.println("StartsWith 'He': " + s1.startsWith("He"));
        System.out.println("EndsWith 'lo': " + s1.endsWith("lo"));

        System.out.println("Replace l with x: " + s1.replace('l', 'x'));
        System.out.println("Replace 'llo' with 'yy': " + s1.replace("llo", "yy"));

        System.out.println("To Upper: " + s1.toUpperCase());
        System.out.println("To Lower: " + s1.toLowerCase());
        
        System.out.println("Trim: '" + s3.trim() + "'");

        String[] words = s4.split(" ");
        System.out.println("Split: ");
        for (String word : words) {
            System.out.println(word);
        }

        int num = 100;
        String numstr = String.valueOf(num);
        System.out.println("Num to string: " + numstr);

        System.out.println("Hash code: " + s1.hashCode());

        byte[] byteArr = s1.getBytes();
        System.out.println("To byte arr: ");
        for (byte b : byteArr) {
            System.out.print(b + " ");
        }
        System.out.println("");

        char[] chArr = s1.toCharArray();
        System.out.println("To char array: ");
        for (char ch : chArr) {
            System.out.print(ch + " ");
        }
        System.out.println("");

        String empty = "";
        System.out.println("Is Empty: " + empty.isEmpty());

        String joined = String.join("-", "16", "02", "2026");
        System.out.println("Join: " + joined);
    }
}