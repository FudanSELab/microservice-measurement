package TraceAnalysis.service;

import TraceAnalysis.domain.Article;
import TraceAnalysis.request.user.ArticleRequest;
import TraceAnalysis.utility.response.ResponseWrapper;

public interface ArticleService {
    ResponseWrapper<?> authorMeeting(String username);

    ResponseWrapper<?> getArticleDetail(String articleId);

    ResponseWrapper<?> submitNewArticle(ArticleRequest request, String targetRootDir);

    ResponseWrapper<?> updateArticle(String articleId, ArticleRequest request, String targetRootDir);

    ResponseWrapper<?> findById(long id);

    ResponseWrapper<?> getSubmissionList(String authorName, String meetingName);

    ResponseWrapper<?> findByMeetingNameAndStatus(String meetingName, String status);

    ResponseWrapper<?> save(Article article);

    ResponseWrapper<?> findArticleMessagesByChairName(String chairName);

    ResponseWrapper<?> findArticleResultMessagesByAuthorName(String authorName);
}
