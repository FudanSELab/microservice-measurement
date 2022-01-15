package TraceAnalysis.service;

import TraceAnalysis.request.util.LoginRequest;
import TraceAnalysis.request.util.RegisterRequest;
import TraceAnalysis.utility.response.ResponseWrapper;

public interface MessageService {

    ResponseWrapper<?> findArticleResultMessagesByAuthorName(String authorName);

    ResponseWrapper<?> findArticleMessagesByChairName(String chairName);

    ResponseWrapper<?> findInvitationResultMessagesByChairName(String chairName);

    ResponseWrapper<?> findReviewingMeetingMessagesByPCMemberName(String pcMemberName);


}
