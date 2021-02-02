package hu.hazazs.lookandsay;

public class App {
    public static void main( String[] args ) {
        lookAndSay(10);
    }
    public static void lookAndSay(int n) {
        String actual = "1";
        for (int k = 0; k < n; k++) {
            System.out.println(actual);
            StringBuilder next = new StringBuilder(2);
            int count = 1;
            for (int i = 0; i < actual.length(); i++)
                if (i+1 == actual.length() || actual.charAt(i+1) != (actual.charAt(i))) {
                    next.append(count).append(actual.charAt(i));
                    count = 1;
                } else count++;
            actual = next.toString();
        }
    }
}