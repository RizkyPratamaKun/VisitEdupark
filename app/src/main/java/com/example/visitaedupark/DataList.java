package com.example.visitaedupark;

public class DataList {
    private int imageid;
    private String title;
    private String detail;
    private String deskripsi;
    private String longlat;

    public DataList(int imageid, String title, String detail,String deskripsi,String longlat) {
        this.imageid = imageid;
        this.title = title;
        this.detail = detail;
        this.deskripsi = deskripsi;
        this.longlat = longlat;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getdetail() {
        return detail;
    }

    public void setdetail(String detail) {
        this.detail = detail;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String detail) {
        this.deskripsi = deskripsi;
    }
    public String getLonglat() {
        return longlat;
    }
    public void setLonglat(String longlat) {
        this.longlat = longlat;
    }
}
