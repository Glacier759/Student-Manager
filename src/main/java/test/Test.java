package test;


import com.zzx.graduate.entity.AttachFile;
import com.zzx.graduate.util.StreamUtil;
import org.apache.commons.io.FileUtils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by glacier on 15-5-17.
 */
public class Test {

    public static void main(String[] args) throws IOException {
        File f = new File("./tmp/pom.xml");
        AttachFile file = new AttachFile();
        file.setFileName(f.getName());
        file.setFileBytes(StreamUtil.toByteArray(FileUtils.openInputStream(f)));

        byte[] attachFile;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(file);
        attachFile = baos.toByteArray();
        System.out.println(attachFile.length);
    }

}
