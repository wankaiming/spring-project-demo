package com.project.demo.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.demo.entity.News;
import com.project.demo.news.service.NewsServiceImpl;
import com.project.demo.news.vo.NewsListOrInfoParam;
import com.project.demo.news.vo.NewsListOrInfoParam.NewsInfoParam;
import com.project.demo.news.vo.NewsListOrInfoParam.NewsListParam;
import com.project.demo.news.vo.NewsListVo;
import com.project.demo.util.ValidateUtil;

/**
 * 资讯相关的操作
 * @author wankaiming
 */
@Controller
@RequestMapping("/news")
public class NewsController {
    
    @Autowired
    private NewsServiceImpl newsService;
    
    /**
     * 资讯列表获取
     * @author wankaiming
     */
    @RequestMapping(value = "/list", method = { RequestMethod.POST,RequestMethod.GET })
    public ModelAndView list(@Validated(NewsListParam.class) NewsListOrInfoParam param, BindingResult bindingResult){
        ModelAndView mv = new ModelAndView();
        
        // 验证参数
        if (bindingResult.hasErrors()) {
            String msg = ValidateUtil.errorMessage(bindingResult);
            mv.addObject("msg", msg);
            mv.setViewName("error/error-info");
            return mv;
        }else{
            List<News> newsList = newsService.getNewsListByCateId(param.getCateId());
            mv.addObject("newsList", newsList);
            mv.addObject("param", param);
            mv.setViewName("news/news-list");
            return mv;
        }
    }
    
    /**
     * 资讯内容获取
     * @author wankaiming
     */
    @RequestMapping(value = "/info", method = { RequestMethod.POST,RequestMethod.GET })
    public ModelAndView info(@Validated(NewsInfoParam.class) NewsListOrInfoParam param, BindingResult bindingResult){
        ModelAndView mv = new ModelAndView();
        
        // 验证参数
        if (bindingResult.hasErrors()) {
            String msg = ValidateUtil.errorMessage(bindingResult);
            mv.addObject("msg", msg);
            mv.setViewName("error/error-info");
            return mv;
        }else{
            News info = newsService.getNewsInfoById(param.getId());
            mv.addObject("info", info);
            mv.addObject("param", param);
            mv.setViewName("news/news-info");
            return mv;
        }
    }
    
    /**
     * 获取资讯分类以及下面的资讯列表
     * @author wankaiming
     */
    @RequestMapping(value = "/listByCate", method = { RequestMethod.POST,RequestMethod.GET })
    public ModelAndView listByCate(){
        ModelAndView mv = new ModelAndView();
        
        List<NewsListVo> newsList = newsService.getListByCate();
        mv.addObject("newsList", newsList);
        mv.setViewName("news/news-listByCate");
        
        return mv;
    }
}
