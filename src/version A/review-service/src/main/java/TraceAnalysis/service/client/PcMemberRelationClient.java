package TraceAnalysis.service.client;

import TraceAnalysis.domain.PCMemberRelation;

import java.util.List;


public interface PcMemberRelationClient {

    List<PCMemberRelation> findByMeetingIdAndStatus(long meetingId, String status);
}
