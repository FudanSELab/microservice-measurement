package TraceAnalysis.service;

import TraceAnalysis.request.meeting.MeetingApplicationRequest;
import TraceAnalysis.request.meeting.PCMemberInvitationRequest;
import TraceAnalysis.request.user.InvitationRepoRequest;
import TraceAnalysis.utility.response.ResponseWrapper;

public interface PcMemberRelationService {
    ResponseWrapper<?> pcMemberMeeting(String username);

    ResponseWrapper<?> invitationRepo(InvitationRepoRequest request);

    ResponseWrapper<?> undealedNotificationsNum(String username);

    ResponseWrapper<?> undealedNotifications(String username);

    ResponseWrapper<?> alreadyDealedNotifications(String username);

    ResponseWrapper<?> meetingApplication(MeetingApplicationRequest request);

    ResponseWrapper<?> pcmInvitation(PCMemberInvitationRequest request);

    ResponseWrapper<?> getInvitationStatus(String meetingName);

    ResponseWrapper<?> findByMeetingIdAndStatus(long meetingId, String status);

    ResponseWrapper<?> findInvitationResultMessagesByChairName(String chairName);

    ResponseWrapper<?> findReviewingMeetingMessagesByPCMemberName(String pcMemberName);
}
