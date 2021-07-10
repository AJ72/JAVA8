package Lamda;

public class MyMain {

    public static void main(String args[]) {

        MyInter t1 = (str) -> {

            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a'] = count[str.charAt(i) - 'a'] + 1;
            }

            for (int i = 0; i < str.length(); i++) {
                if (count[str.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }
            return -1;
        };
        System.out.println(t1.run("abacb"));

        Runnable r1 = () -> System.out.println("Where are you");
        r1.run();
    }
}
