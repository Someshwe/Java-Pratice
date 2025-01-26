import java.io.*;
public class fileh {
    public static void main(String[] args) throws Exception{
      /*   File file=new File("abc.txt");
        file.createNewFile();
        System.out.println(file.exists());
        FileWriter fw=new FileWriter(file);
        fw.write("Hii i am somesh .i am the Deploma student in cse branch");
        fw.close();
        FileReader fr=new FileReader(file);
        System.out.println(fr.read());
        */  
        FileWriter fw=new FileWriter("abc.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        fw.write("Hii somesh nice to meet you  and i am so happy to having you");
        fw.close();
        FileReader file=new FileReader("abc.txt");
        BufferedReader br=new BufferedReader(file);
       System.out.println(br.readLine()); 
     }
}