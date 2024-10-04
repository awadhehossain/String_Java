public class StringConversion {
    public static void main(String[] args) {
        int a = 10;
        float f = 3.46f;
        boolean b = true;
        long l = 13243546;

        //other data type to String
        String s1 = a + "";
        String s2 = String.valueOf(f);
        String s3 = String.valueOf(b);
        String s4 = String.valueOf(l);


        //String to other data type
        int a1 = Integer.parseInt(s1);
        float f1 = Float.parseFloat(s2);
        boolean b1 = Boolean.parseBoolean(s3);
        long l1 = Long.parseLong(s4);



    }
}
