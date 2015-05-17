package com.zzx.graduate.entity;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import java.io.*;

/**
 * Created by glacier on 15-5-17.
 */
public class AttachFile implements Serializable {

    private static Logger logger = Logger.getLogger(AttachFile.class.getName());

    private String fileName;
    private InputStream fileStream;

    public AttachFile() {

    }

    public AttachFile(String fileName, InputStream fileStream) {
        this.fileName = fileName;
        this.fileStream = fileStream;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public InputStream getFileStream() {
        return fileStream;
    }

    public void setFileStream(InputStream fileStream) {
        this.fileStream = fileStream;
    }

    public String toFile() {
        try {
            String path = "./tmp/download_file/" + fileName;
            File tmpFile = new File(path);
            if ( !tmpFile.exists() )
                tmpFile.createNewFile();
            FileUtils.copyInputStreamToFile(fileStream, new File(path));
            return path;
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

    public void delFile(String path) {
        try {
            File tmpFile = new File(path);
            if ( !tmpFile.exists() )
                return;
            else
                tmpFile.delete();
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
    }
}
