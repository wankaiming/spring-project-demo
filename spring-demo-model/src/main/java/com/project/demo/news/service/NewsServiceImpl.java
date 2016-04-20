package com.project.demo.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.entity.News;
import com.project.demo.entity.NewsExample;
import com.project.demo.mapper.NewsMapper;
import com.project.demo.news.dao.NewsDao;
import com.project.demo.news.vo.NewsListVo;

/**
 * 资讯相关的操作
 * @author wankaiming
 */
@Service
public class NewsServiceImpl {
	
	@Autowired
	private NewsMapper newsMapper;
	
	@Autowired
	private NewsDao newsDao; 

	/**
	 * 资讯列表获取
	 * @author wankaiming
	 */
	public List<News> getNewsListByCateId(Integer cateId) {
		if(null==cateId){
			cateId = 0;
		}
		
		NewsExample newsExample = new NewsExample();
		newsExample.createCriteria()
		.andFkCateIdEqualTo(cateId);
		
		newsExample.setOrderByClause("sort asc");
		
		return newsMapper.selectByExample(newsExample);
	}

	/**
	 * 资讯内容获取
	 * @author wankaiming
	 */
	public News getNewsInfoById(Integer id) {
		return newsMapper.selectByPrimaryKey(id);
	}

	/**
	 * 获取资讯分类以及下面的资讯列表
	 * @author wankaiming
	 */
	public List<NewsListVo> getListByCate() {
		return newsDao.getListByCate();
	}

}
