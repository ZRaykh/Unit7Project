import  java.util.ArrayList;
import  java.text.DecimalFormat;
public class PackageSimulator
{
    ArrayList<Package> p = new ArrayList<Package>();

    public PackageSimulator() {}

    public void generatePackages(int packages)
    {

    }

    public String generateZip()
    {
        DecimalFormat d = new DecimalFormat("000");
        String zip = "";
        zip += d.format((int) (Math.random() * 995) + 5);
        zip += "01";
        return zip;
    }
}
