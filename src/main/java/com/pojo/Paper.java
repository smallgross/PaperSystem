package com.pojo;

public class Paper {
    private long paerId;
    private String paerName;
    private int paperNum;
    private String paperDetail;

    public long getPaerId() {
        return paerId;
    }

    public void setPaerId(long paerId) {
        this.paerId = paerId;
    }

    public String getPaerName() {
        return paerName;
    }

    public void setPaerName(String paerName) {
        this.paerName = paerName;
    }

    public int getPaperNum() {
        return paperNum;
    }

    public void setPaperNum(int paperNum) {
        this.paperNum = paperNum;
    }

    public String getPaperDetail() {
        return paperDetail;
    }

    public void setPaperDetail(String paperDetail) {
        this.paperDetail = paperDetail;
    }

    public Paper(long paerId, String paerName, int paperNum, String paperDetail) {
        this.paerId = paerId;
        this.paerName = paerName;
        this.paperNum = paperNum;
        this.paperDetail = paperDetail;
    }


}
