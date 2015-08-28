package picture;

import java.io.*;
import com.alibaba.fastjson.JSON;
/**
 * Created by zpl on 15-8-28.
 */
public class LoadConf {
    private static String path = "resource/conf.json";
    public static String ReadFile(String path) {
        File file = new File(path);
        BufferedReader reader = null;
        String laststr = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                laststr = laststr + tempString;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                    System.exit(-1);
                }
            }
        }
        return laststr;
    }
    public static void writeFile(String filePath, String sets)
            throws IOException {
        FileWriter fw = new FileWriter(filePath);
        PrintWriter out = new PrintWriter(fw);
        out.write(sets);
        out.println();
        fw.close();
        out.close();
    }

    public static Conf loadConf(){
        String jsonString = LoadConf.ReadFile(path);
        Conf conf = JSON.parseObject(jsonString, Conf.class);
        return conf;
    } 
    public static void writeConf(Conf conf){
        String out = JSON.toJSONString(conf);
        try {
            writeFile(path,out);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
