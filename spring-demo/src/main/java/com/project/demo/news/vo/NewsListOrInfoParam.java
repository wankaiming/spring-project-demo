package com.project.demo.news.vo;

import javax.validation.constraints.NotNull;


public class NewsListOrInfoParam {
	
	public interface NewsListParam{};
	
	public interface NewsInfoParam{};
	
	@NotNull(message="资讯id不能为空",groups={NewsInfoParam.class})
	Integer id;
	
	Integer cateId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCateId() {
		return cateId;
	}

	public void setCateId(Integer cateId) {
		this.cateId = cateId;
	}
}
