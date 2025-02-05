package inputstreamreader.readandwritetofile;

import java.io.*;

public class UserInput {
    public static void readFromuser(){
        String filepath = "sample";
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(filepath);
            BufferedWriter bw = new BufferedWriter(fw);
            String inp ;
            System.out.println("Enter the text");
            while(!(inp = br.readLine()).equalsIgnoreCase("exit")){
                bw.write(inp);
                bw.newLine();

            }
            br.close();
            bw.close();
            System.out.println(filepath);

        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
