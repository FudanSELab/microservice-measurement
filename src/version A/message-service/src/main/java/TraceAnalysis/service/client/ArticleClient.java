package TraceAnalysis.service.client;

import TraceAnalysis.domain.Article;

import java.util.List;


public interface ArticleClient {

    List<String> getArticleMessagesByChairName(String chairName);

    List<String> getArticleResultMessagesByAuthorName(String authorName);
}
