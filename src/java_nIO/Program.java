package java_nIO;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        try {
        Path path = Paths.get("/home/arcanjo/learning/arquivo.txt");
        List<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("Aline");

        StringBuilder conteudo = new StringBuilder();
        nomes.forEach(c -> conteudo.append(c + "\n"));
        Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
