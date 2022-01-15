package authorarticle.service.author.api;

import authorarticle.domain.Article;

import java.util.List;




public interface ArticleService {
    Article findArticleById(String id);
//    all List<Article> blow
    List<Article> findArticleByIdNot(String id);
    List<Article> findArticleByContributorName(String contributorName);
    List<Article> findArticleByMeetingName(String meetingName);
    List<Article> findArticleByMeetingNameAndStatus(String meetingName,String status);
    List<Article> findArticleByContributorNameAndMeetingName(String contributeName,String meetingName);
    Boolean saveArticle(Article article);
}
