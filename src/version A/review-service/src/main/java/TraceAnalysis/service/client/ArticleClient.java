package TraceAnalysis.service.client;

import TraceAnalysis.domain.Article;

import java.util.List;


public interface ArticleClient {

    void save(Article article);
    Article findById(long id);
    List<Article> findByIdNot(long id);
    List<Article> findByContributorName(String contributorName);
    List<Article> findByMeetingName(String meetingName);
    List<Article> findByMeetingNameAndStatus(String meetingName,String status);
    List<Article> findByContributorNameAndMeetingName(String contributeName,String meetingName);
}
