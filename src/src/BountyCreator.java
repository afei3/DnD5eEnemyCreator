import java.io.PrintWriter;

public class BountyCreator {
    public static void createBounty(String fileName) {
        try {
            PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
            writer.println("The first line");
            writer.println("The second linne");
            writer.close();
        } catch (Exception e) {
            System.out.println("Get Dabbed on");
        }
    }
}
