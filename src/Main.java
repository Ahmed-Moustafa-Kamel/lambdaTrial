public class Main {
    public static void main(String[] args) {
        String str1 = "alaaaaaaa";
        String str2 = "Ahmed";

        StringUtils.betterString(str1, str2, (s1, s2) -> s1.length() > s2.length());
        StringUtils.betterString(str1, str2, (s1, s2) -> false);
        StringUtils.betterString(str1, str2, (s1, s2) -> true);
    }
}
