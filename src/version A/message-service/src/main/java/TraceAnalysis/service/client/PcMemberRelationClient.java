package TraceAnalysis.service.client;

import TraceAnalysis.domain.PCMemberRelation;

import java.util.List;


public interface PcMemberRelationClient {

    List<String>  getInvitationResultMessagesByChairName(String chairName);

    List<String> getArticleResultMessagesByAuthorName(String authorName);
}
