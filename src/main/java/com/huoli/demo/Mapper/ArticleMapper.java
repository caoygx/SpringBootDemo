package com.huoli.demo.Mapper;

import com.huoli.demo.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
	List<Article> getAll();
    
    Article getOne(Long id);
 
    void insert(Article user);
 
    void update(Article user);
 
    void delete(Long id);
}
