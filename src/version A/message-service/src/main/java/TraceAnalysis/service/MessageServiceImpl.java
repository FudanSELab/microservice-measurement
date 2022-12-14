package TraceAnalysis.service;

import TraceAnalysis.service.client.ArticleClient;
import TraceAnalysis.service.client.PcMemberRelationClient;
import TraceAnalysis.utility.response.ResponseGenerator;
import TraceAnalysis.utility.response.ResponseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MessageServiceImpl implements MessageService {

    Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);

    @Autowired
    ArticleClient articleClient;

    @Autowired
    PcMemberRelationClient pcMemberRelationClient;

    public ResponseWrapper<?> findArticleMessagesByChairName(String chairName){
        return new ResponseWrapper<>(200, ResponseGenerator.success, articleClient.getArticleMessagesByChairName(chairName));
    }

    public ResponseWrapper<?> findArticleResultMessagesByAuthorName(String authorName){
        return new ResponseWrapper<>(200, ResponseGenerator.success, articleClient.getArticleResultMessagesByAuthorName(authorName));
    }

    public ResponseWrapper<?> findInvitationResultMessagesByChairName(String chairName){
        return new ResponseWrapper<>(200, ResponseGenerator.success, pcMemberRelationClient.getInvitationResultMessagesByChairName(chairName));
    }

    public ResponseWrapper<?> findReviewingMeetingMessagesByPCMemberName(String pcMemberName){
        return new ResponseWrapper<>(200, ResponseGenerator.success, pcMemberRelationClient.getArticleResultMessagesByAuthorName(pcMemberName) );
    }

}
