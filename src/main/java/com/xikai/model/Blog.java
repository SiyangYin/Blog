package com.xikai.model;

import javax.persistence.*;

/**
 * Created by xikaixiong on 3/7/17.
 */


@Entity
@Table(name="blog")
public class Blog {

    @Id
    private int id;
    @Column(name = "title")
    private String title;

    @Column(name="body",columnDefinition = "TEXT")
    private String body;

    public Blog() {
    }

    public Blog(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
