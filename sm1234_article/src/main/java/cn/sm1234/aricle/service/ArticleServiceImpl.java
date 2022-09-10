package cn.sm1234.aricle.service;

import cn.sm1234.aricle.dao.ArticleDao;
import cn.sm1234.aricle.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章service实现
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<Article> findAll() {
        return articleDao.findAll();
    }

    @Override
    public Article findById(Integer id) {
        return articleDao.findById(id).get();
    }

    @Override
    public void add(Article article) {
        articleDao.save(article);
    }

    @Override
    public void update(Article article) {
        articleDao.save(article);
    }

    @Override
    public void deleteById(Integer id) {
        articleDao.deleteById(id);
    }
}
