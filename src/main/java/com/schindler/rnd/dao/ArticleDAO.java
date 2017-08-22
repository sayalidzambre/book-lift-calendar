package com.schindler.rnd.dao;

import java.util.List;

import com.schindler.rnd.beans.Article;

public interface ArticleDAO {
    List<Article> getAllArticles();
    Article getArticleById(int articleId);
    void addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);
    boolean articleExists(String title, String category);
} 
