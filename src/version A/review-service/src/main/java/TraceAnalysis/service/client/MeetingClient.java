package TraceAnalysis.service.client;

import TraceAnalysis.domain.Meeting;

import java.util.List;


public interface MeetingClient {

    void save(Meeting meeting);

    Meeting findById(long id);

    Meeting findByMeetingName(String meetingName);

    List<Meeting> findByStatus(String status);

    List<Meeting> findByStatusNot(String status);

    List<Meeting> findByChairName(String chairName);

    List<Meeting> findByStatusAndChairNameNot(String status, String chairName);
}
