package Object.String;

public class StringEx1 {

    public void Execute() {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

    }

}
