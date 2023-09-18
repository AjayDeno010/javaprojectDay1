//package File.Read.And.Write;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;

//public class ReadFile {
//    public static void main(String[] args) throws IOException, InterruptedException {

//        String S= "src/main/java/STR1.txt";
//        Path Filepath= Paths.get(S);
//        Files.createFile(Filepath);
//        Files.writeString(Filepath,
//                                 """
//                1984–2001Silambarasan appeared as a baby in the film Uravai
//                Kaatha Kili held by his father T Rajendar. He started acting in several of his father's
//                movies, including Thai Thangai Paasam, Oru Vasantha Geetham, En Thangai Kalyani,
//                Enga Veetu Velan, Monisha En Monalisa, Oru Thayin Sabhatham, Samsara Sangeetham,
//                Shanti Enathu Shanti, Pettredutha Pillai and Sabash Babu.[2]
//                """
//        );
//      Thread Thread = new Thread(() -> {
//
//
//          BufferedReader Br= null;
//          try {
//              System.out.println("Current  para Thread id"+java.lang.Thread.currentThread().getId());
//              Br = new BufferedReader(new FileReader(S));
//          } catch (FileNotFoundException e) {
//              throw new RuntimeException(e);
//          }
//          String line= null;
//          try {
//              line = Br.readLine();
//          } catch (IOException e) {
//              throw new RuntimeException(e);
//          }
//          while(line != null){
//              try {
//                  System.out.println(Br.readLine());
//              } catch (IOException e) {
//                  throw new RuntimeException(e);
//              }
//              try {
//                  line= Br.readLine();
//              } catch (IOException e) {
//                  throw new RuntimeException(e);
//              }
//          }
//
//      });
//      Thread.start();
//    //Thread 2
//        String S1= "src/main/java/STR2.txt";
//        Path Filepath1= Paths.get(S1);
//        Files.createFile(Filepath1);
//        Files.writeString(Filepath1,
//                """
//                        Silambarasan was born on 3 February 1983 in Thogarapalli, Krishnagiri, Tamil Nadu, as the eldest child of T.
//                        Rajendar and Usha Rajendar. He has a younger brother Kuralarasan, and a sister Ilakiya. From an early age,
//                        he has been a devout Hindu and an ardent follower of Lord Shiva.[4]Silambarasan was educated at Don Bosco Matriculation
//                        Higher Secondary School, Chennai. He then studied at the Loyola College, Chennai.[5] Silambarasan starred in many of his
//                        father's films as a child until 2002, when he acted in his father's Kadhal Azhivathillai, his first main role as a hero.
//                        """
//        );
//        Thread Thread1 = new Thread(() -> {
//            BufferedReader Br= null;
//            try {
//                System.out.println("Current above para Thread1 id"+java.lang.Thread.currentThread().getId());
//                Br = new BufferedReader(new FileReader(S1));
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//            String line= null;
//            try {
//                line = Br.readLine();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            while(line != null){
//                try {
//                    System.out.println(Br.readLine());
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//                try {
//                    line= Br.readLine();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//        });
//        Thread1.start();
//        Thread.join();
//        Thread1.join();
//
//
//
//
//    }
//}
