package com.zzx.graduate.entity;

import com.zzx.graduate.util.StreamUtil;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import sun.swing.FilePane;

import java.io.*;

/**
 * Created by glacier on 15-5-17.
 */
public class AttachFile implements Serializable {

    private static Logger logger = Logger.getLogger(AttachFile.class.getName());

    private String fileName;
    private byte[] fileBytes;

    public AttachFile() {

    }

    public AttachFile(File attachFile) {
        try {
            this.fileName = attachFile.getName();
            this.fileBytes = StreamUtil.toByteArray(FileUtils.openInputStream(attachFile));
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
    }

    public AttachFile(String fileName, byte[] fileBytes) {
        this.fileName = fileName;
        this.fileBytes = fileBytes;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFileBytes() {
        return fileBytes;
    }

    public void setFileBytes(byte[] fileBytes) {
        this.fileBytes = fileBytes;
    }

    public String toFile() {
        try {
            String path_dir = "./tmp/download_file/";
            String path = path_dir + fileName;
            File tmpFile = new File(path);
            if ( !tmpFile.exists() ) {
                new File(path_dir).mkdirs();
                tmpFile.createNewFile();
            }
            FileUtils.writeByteArrayToFile(new File(path), fileBytes);
            return (new File(".").getAbsolutePath());
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
