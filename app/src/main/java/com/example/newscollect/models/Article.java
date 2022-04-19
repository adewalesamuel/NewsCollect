package com.example.newscollect.models;

public class Article {
    private String title;
    private String date;
    private String img_url;
    private String href;

    public Article(String title, String date, String img_url, String href) {
        this.title = title;
        this.date = date;
        this.img_url = img_url;
        this.href = href;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", img_url='" + img_url + '\'' +
                ", href='" + href + '\'' +
                '}';
    }
}
