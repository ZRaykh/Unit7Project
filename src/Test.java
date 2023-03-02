import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("000");
        String zip = "";
        zip += d.format((int) (Math.random() * 995) + 5);
        zip += "01";
        System.out.println(zip);
    }
}
