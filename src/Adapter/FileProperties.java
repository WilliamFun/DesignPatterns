package Adapter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties implements FileIo{
    private Properties pro;

    public FileProperties(){
        pro = new Properties();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        InputStream in = getClass().getResourceAsStream(filename);
        pro.load(in);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        OutputStream out = new FileOutputStream("./src/Adapter/"+filename);
        pro.store(out,"no");
    }

    @Override
    public void setValue(String key, String value) {
        pro.setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return pro.getProperty(key);
    }
}
