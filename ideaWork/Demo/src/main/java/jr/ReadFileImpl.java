package jr;

import java.io.*;

public class ReadFileImpl implements ReadFile {

    @Override
    public StringBuilder readOneLine(String filePath) throws IOException {

        InputStream is = new FileInputStream("/Users/pxcm-0101-01-0053/Documents/aaa.txt");

        StringBuilder sb = new StringBuilder();

//        try {
//            sb = sb.append() ;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            is.close();
//        }

        return sb;
    }
}
