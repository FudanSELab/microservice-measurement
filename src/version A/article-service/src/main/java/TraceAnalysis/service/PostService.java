package TraceAnalysis.service;

import TraceAnalysis.utility.response.ResponseWrapper;
import TraceAnalysis.request.meeting.ReviewPostRequest;

public interface PostService {
    ResponseWrapper<?> reviewPost(ReviewPostRequest request);
    ResponseWrapper<?> getPostList(long articleId, String postStatus);
}
