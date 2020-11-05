package com.erjuwatra.jos.patikunew;

public class Item {
    private String imageResources;
    private String title;
    private String desc;
    private String koordinat;
    private String sharebutton;
    private boolean isShrink = true;

    public Item() {
    }

    public String getSharebutton() {
        return sharebutton;
    }

    public void setSharebutton(String sharebutton) {
        this.sharebutton = sharebutton;
    }

    public Item(String imageResources, String title, String desc, String koordinat, String sharebutton) {
        this.imageResources = imageResources;
        this.title = title;
        this.desc = desc;
        this.koordinat = koordinat;
        this.sharebutton = sharebutton;
    }

    public String getImageResources() {
        return imageResources;
    }

    public String getKoordinat() {
        return koordinat;
    }

    public void setKoordinat(String koordinat) {
        this.koordinat = koordinat;
    }

    public void setImageResources(String imageResources) {
        this.imageResources = imageResources;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isShrink() {
        return isShrink;
    }

    public void setShrink(boolean shrink) {
        isShrink = shrink;
    }
}
