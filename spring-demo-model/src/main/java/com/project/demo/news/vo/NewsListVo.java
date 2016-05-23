package com.project.demo.news.vo;

import java.util.List;

import com.project.demo.entity.News;

public class NewsListVo {
    
    private Integer id;

    private String name;

    private List<News> newsList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }
}
