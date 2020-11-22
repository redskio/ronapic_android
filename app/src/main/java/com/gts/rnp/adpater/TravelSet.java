package com.gts.rnp.adpater;

public class TravelSet {
    private String text ;
    private int like ;
    private int image;

    public TravelSet(String text, int like, int image) {
        this.text = text;
        this.like = like;
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
