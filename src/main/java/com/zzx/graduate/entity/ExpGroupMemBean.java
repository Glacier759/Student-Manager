package com.zzx.graduate.entity;

/**
 * Created by glacier on 15-5-14.
 */
public class ExpGroupMemBean {

    private int groupMemID, groupID, stuID;
    private String memTask;
    private int leaderTag;

    public ExpGroupMemBean() {

    }

    /**
     * @param groupMemID 成员ID
     * @param groupID 小组ID
     * @param stuID 学生ID
     * @param memTask 分工
     * @param leaderTag 负责人标志
     * */
    public ExpGroupMemBean(int groupMemID, int groupID, int stuID, String memTask, int leaderTag) {
        this.groupMemID = groupMemID;
        this.groupID = groupID;
        this.stuID = stuID;
        this.memTask = memTask;
        this.leaderTag = leaderTag;
    }

    public int getGroupMemID() {
        return groupMemID;
    }

    public void setGroupMemID(int groupMemID) {
        this.groupMemID = groupMemID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getMemTask() {
        return memTask;
    }

    public void setMemTask(String memTask) {
        this.memTask = memTask;
    }

    public int getLeaderTag() {
        return leaderTag;
    }

    public void setLeaderTag(int leaderTag) {
        this.leaderTag = leaderTag;
    }
}
