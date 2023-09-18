package ProcessorAndConsumer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Filesreadandwrite {
    public static void main(String[] args) throws IOException {
        String S= "src/main/java/STR1.txt";
        Path Filepath= Paths.get(S);
        Files.createFile(Filepath);
        Files.writeString(Filepath,
                """
1984–2001Silambarasan appeared as a baby in the film Uravai 
Kaatha Kili held by his father T Rajendar. He started acting in several of his father's 
movies, including Thai Thangai Paasam, Oru Vasantha Geetham, En Thangai Kalyani, 
Enga Veetu Velan, Monisha En Monalisa, Oru Thayin Sabhatham, Samsara Sangeetham, 
Shanti Enathu Shanti, Pettredutha Pillai and Sabash Babu.[2]
"""
        );
        ExecutorService Executorservice= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        BufferedReader Br= new BufferedReader(new FileReader(S));
        final String[] line = {Br.readLine()};
        Executorservice.execute(new Runnable() {
            @Override
            public void run() {
                while(line[0] != null){
                    try {
                        System.out.println(Br.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        line[0] = Br.readLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        });
        Executorservice.shutdown();

    }

}
