package model;

import android.widget.LinearLayout;

public class Dashboard2_model {

    String abc, tv1;
    Integer imagecook;
    int ll1;

    public Dashboard2_model(String abc, String tv1, Integer imagecook, int ll1) {
        this.abc = abc;
        this.tv1 = tv1;
        this.imagecook = imagecook;
        this.ll1 = ll1;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public String getTv1() {
        return tv1;
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    public Integer getImagecook() {
        return imagecook;
    }

    public void setImagecook(Integer imagecook) {
        this.imagecook = imagecook;
    }

    public int getLl1() {
        return ll1;
    }

    public void setLl1(int ll1) {
        this.ll1 = ll1;
    }
}
