import java.io.File;
import java.math.BigDecimal;

public class IOtest {
    static File file1 = new File("C:\\Program Files\\7-Zip");

    public static void main(String[] args) {
        BigDecimal bd2 = new BigDecimal(1024);
        BigDecimal bd3 = new BigDecimal(filesize(file1, 0, 0));
        System.out.println(bd3 + "b");
    }

    public static long filesize(File file, int b, long a) {
        File fs[] = file.listFiles();
        if (b <= fs.length - 1) {
            if (fs[b].isFile()) {
                a += fs[b].length();
                b++;
                return filesize(file, b, a);
            } else if (fs[b].isDirectory()) {
                a += filesize(fs[b], 0, 0);
                b++;
                return filesize(file, b, a);
            }
        }
        return a;

    }

}
