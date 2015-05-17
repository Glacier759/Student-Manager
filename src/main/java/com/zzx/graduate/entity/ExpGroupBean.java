package com.zzx.graduate.entity;

import org.apache.log4j.Logger;

import java.io.*;

/**
 * Created by glacier on 15-5-14.
 */
public class ExpGroupBean {

    private static Logger logger = Logger.getLogger(ExpGroupBean.class.getName());

    private int groupID, expID;
    private String groupName, prjName, prjDescription;
    private byte[] attachFile;
    private int status;

    public ExpGroupBean() {

    }

    /**
     * @param groupID 小组ID
     * @param expID 实验ID
     * @param groupName 小组名称
     * @param prjName 项目名称
     * @param prjDescription 项目描述
     * @param attachFile 附件
     * @param status 小组状态
     * */
    public ExpGroupBean(int expID, int groupID, String groupName, String prjName, String prjDescription, byte[] attachFile, int status) {
        this.expID = expID;
        this.groupID = groupID;
        this.groupName = groupName;
        this.prjName = prjName;
        this.prjDescription = prjDescription;
        this.attachFile = attachFile;
        this.status = status;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getExpID() {
        return expID;
    }

    public void setExpID(int expID) {
        this.expID = expID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getPrjName() {
        return prjName;
    }

    public void setPrjName(String prjName) {
        this.prjName = prjName;
    }

    public String getPrjDescription() {
        return prjDescription;
    }

    public void setPrjDescription(String prjDescription) {
        this.prjDescription = prjDescription;
    }

    public byte[] getAttachFile() {
        return attachFile;
    }

    public AttachFile getAttach2File() {
        try {
            if ( attachFile == null )
                return null;
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(attachFile));
            AttachFile file = (AttachFile) ois.readObject();
            return file;
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

    public void setAttachFile(byte[] attachFile) {
        this.attachFile = attachFile;
    }

    public void setAttach2File(AttachFile file) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(file);
            attachFile = baos.toByteArray();
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ExpGroupBean{" +
                "groupID=" + groupID +
                ", expID=" + expID +
                ", groupName='" + groupName + '\'' +
                ", prjName='" + prjName + '\'' +
                ", prjDescription='" + prjDescription + '\'' +
                ", attachFile='" + attachFile + '\'' +
                ", status=" + status +
                '}';
    }
}
