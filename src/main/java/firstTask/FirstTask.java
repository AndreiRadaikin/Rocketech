package firstTask;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Collectors;

public class FirstTask {

    public static void main(String[] args) throws IOException {

        String result = Files.lines(new File("./src/main/resources/templates/firstTask.txt").toPath())
                .filter(s -> !s.isEmpty())
                .map(String::trim)
                .collect(Collectors.joining())
                .replace(",", " ")
                .replace(".", " ")
                .replace("/", " ")
                .replace("\\"," ")
                .replace("?", " ")
                .toLowerCase();

        System.out.println(result);
    }
}
