import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        File originalDirectory = new File("original");
//        File buildDirectory = new File("/build");
//        if (!buildDirectory.exists()) {
//            if (!buildDirectory.createNewFile()) {
//                System.err.println("创建build目录失败");
//                return;
//            }
//        }
        System.out.println(new Main().getPath());
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

    public String getPath() {
        return this.getClass().getClassLoader().getResource("").getPath();
    }


}
