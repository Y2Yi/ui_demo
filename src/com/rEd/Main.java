import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        File originalDirectory = new File("original");
        for (File file : Objects.requireNonNull(originalDirectory.listFiles())) {
            String names = file.getName();
            if (names.contains("md")) {
                //执行转换
                String command = "pandoc -s original/" + names + " -o build/" + names.split("\\.")[0] + ".html";
                System.err.println("exec: " + command);
                Runtime.getRuntime().exec(command);
            }
        }

    }
}
