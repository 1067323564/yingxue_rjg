package com.baizhi.entity;

import java.io.Serializable;

public class LianXi implements Serializable {
    private int id;
    private String name;
    private String psd;
    private String sex;

    public LianXi() {
        super();
    }

    @Override
    public String toString() {
        return "LianXi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", psd='" + psd + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LianXi(int id, String name, String psd, String sex) {
        this.id = id;
        this.name = name;
        this.psd = psd;
        this.sex = sex;
    }
}
