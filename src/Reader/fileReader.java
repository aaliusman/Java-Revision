package Reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class fileReader {

    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("/Users/bravo1516/Java/fileReader.rtf");
        }catch (Exception ex){
            System.out.println("file is not located at given path");
        }
        try{
            if(fr != null){
                br = new BufferedReader(fr);
                String st = "";
                while ((st = br.readLine()) != null){
                    System.out.println(st);
                }

            }
        }catch (Exception ex1){
            ex1.printStackTrace();
        }finally{
            if(fr != null){
                try{
                    fr.close();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
            if(br != null){
                try{
                    br.close();

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        }







    }
}
