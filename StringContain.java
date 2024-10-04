public class StringContain {
    public static void main(String[] args) {
        String s1 = "AbA";
        String s2 = "dasaAbAbAty";

        boolean b = s2.contains(s1);
        int index = s2.indexOf(s1);

        System.out.println(b);
        System.out.println(index);

        char[] c = s2.toCharArray();

        for(int i=0;i<s2.length();i++){
            char c1 = s2.charAt(i);
            System.out.println(c1);
        }

        //100123501 -> replace all 0's to 1's 111123511


    }
}
