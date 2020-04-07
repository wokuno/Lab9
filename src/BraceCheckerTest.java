public class BraceCheckerTest {
    public static void main(String[] args) {

        String test = "";
        System.out.println(BraceChecker.checkBraces(test)); // True

        test = "a{g}h";
        System.out.println(BraceChecker.checkBraces(test)); // True

        test = "a[sasdf]daf";
        System.out.println(BraceChecker.checkBraces(test)); // True

        test = "as(sdf)asdf";
        System.out.println(BraceChecker.checkBraces(test)); // True

        test = "af{dfs(fdsa{fsd}fsda)sfad[sdfa{sfda}fsda]fsd{fsd[sfad]fds}fds{fsad(dfsa)fsd}fsd[safd(fsd)fsda{fsd}fsda]afs}asdf";
        System.out.println(BraceChecker.checkBraces(test)); // True

        test = "{{}{}()()[][]}{{}{}()()[][]}({}{}()()[][])({}{}()()[][])[{}{}()()[][]][{}{}()()[][]]";
        System.out.println(BraceChecker.checkBraces(test)); // True

        test = "}{}{";
        System.out.println(BraceChecker.checkBraces(test)); // False

        test = "{}{";
        System.out.println(BraceChecker.checkBraces(test)); // False

        test = "[]]";
        System.out.println(BraceChecker.checkBraces(test)); // False

        test = "[(]";
        System.out.println(BraceChecker.checkBraces(test)); // False

        // yeah, let's just straight up test an entire java class.
        test="import java.util.Arrays;\n" +
                "\n" +
                "public class Euncon {\n" +
                "    public static String[] euncon(String[] data, int n) {\n" +
                "        String[] retVal = new String[data.length * n];\n" +
                "        for(int i = 0; i < data.length; i++) {\n" +
                "            String value = data[i];\n" +
                "            for(int k = 0; k < n; k++) {\n" +
                "                int newIndex = i*n + k;\n" +
                "                retVal[newIndex] = value;\n" +
                "            }\n" +
                "        }\n" +
                "        return retVal;\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        String[] newArray = euncon(new String[]{\"ab\", \"be\", \"ga\"}, 2);\n" +
                "        System.out.println(Arrays.toString(newArray));\n" +
                "    }\n" +
                "}";
        System.out.println(BraceChecker.checkBraces(test)); // True

    }
}
/*
true
true
true
true
true
true
false
false
false
false
true
 */