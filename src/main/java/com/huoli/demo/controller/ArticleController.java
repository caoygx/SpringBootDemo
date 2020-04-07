package com.huoli.demo.controller;

import com.huoli.demo.Mapper.ArticleMapper;
import com.huoli.demo.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ArticleController {
	@Autowired
    private ArticleMapper ArticleMapper;
	
	@RequestMapping("getArticles")
    public List<Article> getArticles() {
        List<Article> users=ArticleMapper.getAll();
        return users;
    }
     
    @RequestMapping("getArticle")
    public Article getArticle(Long id) {
    	Article user=ArticleMapper.getOne(id);
        return user;
    }
     
    @RequestMapping("addArticle")
    public void save(Article user) {
        ArticleMapper.insert(user);
    }
     
//    @RequestMapping(value="update")
//    public void update(Article user) {
//        ArticleMapper.update(user);
//    }
     
    @RequestMapping(value="deleteArticle/{id}")
    public void delete(@PathVariable("id") Long id) {
        ArticleMapper.delete(id);
    }
    

}
