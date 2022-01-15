package TraceAnalysis.service;

import TraceAnalysis.domain.Meeting;
import TraceAnalysis.request.admin.ApplicationRatifyRequest;
import TraceAnalysis.request.meeting.BeginSubmissionRequest;
import TraceAnalysis.request.meeting.FinalPublishRequest;
import TraceAnalysis.request.meeting.ResultPublishRequest;
import TraceAnalysis.utility.response.ResponseWrapper;


public interface MeetingService {
    ResponseWrapper<?> chairMeeting(String username);

    ResponseWrapper<?> availableMeeting(String username);

    ResponseWrapper<?> finalPublish(FinalPublishRequest request);

    ResponseWrapper<?> getMeetingInfo(String meetingName);

    ResponseWrapper<?> beginSubmission(BeginSubmissionRequest request);

    ResponseWrapper<?> reviewPublish(ResultPublishRequest request);

    ResponseWrapper<?> getQueueingApplication();

    ResponseWrapper<?> getAlreadyApplication();

    ResponseWrapper<?> applicationRatify(ApplicationRatifyRequest request);

    ResponseWrapper<?> findById(long id);

    ResponseWrapper<?> findByMeetingName(String meetingName);

    ResponseWrapper<?> findByStatus(String status);

    ResponseWrapper<?> findByStatusNot(String status);

    ResponseWrapper<?> findByChairName(String chairName);

    ResponseWrapper<?> findByStatusAndChairNameNot(String status, String chairName);

    ResponseWrapper<?> save(Meeting meeting);
}
