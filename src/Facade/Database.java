package Facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database(){//防止外部生成Database实例
    }
    public static Properties getProperties(String dbname){
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try{
            prop.load(new FileInputStream(filename));
        }catch (IOException e){
            System.out.println(filename+"is not found");
        }
        return prop;
    }

}
