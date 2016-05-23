package com.project.demo.news.dao;

import java.util.List;

import com.project.demo.news.vo.NewsListVo;

public interface NewsDao {

    /**
     * 获取资讯分类以及下面的资讯列表
     * @author wankaiming
     */
    List<NewsListVo> getListByCate();
}
