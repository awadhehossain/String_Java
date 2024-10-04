public class StringSplit {
    public static void main(String[] args) {
        String s1 = "Abc,101,3.5"; //Abc || 101 || 3.5

        String[] parts = s1.split("1");
        for(int i=0;i<parts.length;i++){
            System.out.println(parts[i]);
        }

    }
}
