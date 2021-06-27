public class StringUtils {
    public static void betterString(String str1, String str2, BiPredicate predicate)
    {
        if(predicate.isBetter(str1, str2))
            System.out.println("A is better than B");
        else
            System.out.println("B is better than A");
    }
}

