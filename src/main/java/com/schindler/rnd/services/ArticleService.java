package com.schindler.rnd.services;

import java.util.List;

import com.schindler.rnd.beans.Article;

public interface ArticleService {
	List<Article> getAllArticles();

	Article getArticleById(int articleId);

	boolean addArticle(Article article);

	void updateArticle(Article article);

	void deleteArticle(int articleId);
}