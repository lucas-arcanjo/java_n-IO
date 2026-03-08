package java_nIO;

import java.io.File;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        File diretorio = new File("/home/arcanjo/learning");
        System.out.println("Diretorio existe? " + diretorio.exists());
        if (!diretorio.exists()) {
            diretorio.mkdir();
            System.out.println("Criando um diretorio." + diretorio.exists());
        }
        try {
            File arquivo = new File(diretorio, "arquivo.txt");
            arquivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
