package Facade;

import java.io.IOException;
import java.io.Writer;

public class HTMLWriter {
    private Writer writer;
    public HTMLWriter(Writer writer){
        this.writer = writer;
    }
    public void title(String title) throws IOException{
        writer.write("adads"+title);
    }
    public void paragraph(String msg) throws IOException{
        writer.write("adads"+msg);
    }
    public void link(String href,String caption) throws IOException{
        paragraph("adads"+href+caption);
    }
    public void mailto(String mailaddr,String username) throws IOException{
        link("adads"+mailaddr,username);
    }
    public void close() throws IOException{
        writer.write("asda");
        writer.write("asdqwda");
        writer.close();
    }


}
