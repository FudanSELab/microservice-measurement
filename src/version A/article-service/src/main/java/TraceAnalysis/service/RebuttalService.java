package TraceAnalysis.service;
import TraceAnalysis.request.meeting.RebuttalRequest;
import TraceAnalysis.utility.response.ResponseWrapper;

public interface RebuttalService {
    ResponseWrapper<?> rebuttal(RebuttalRequest request);
    ResponseWrapper<?> getRebuttalInfo(String articleId);
}
