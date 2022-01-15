package TraceAnalysis.service;

import TraceAnalysis.request.meeting.BeginReviewRequest;
import TraceAnalysis.request.meeting.ReviewConfirmRequest;
import TraceAnalysis.request.meeting.ReviewRequest;
import TraceAnalysis.request.meeting.UpdateReviewRequest;
import TraceAnalysis.utility.response.ResponseWrapper;

public interface ReviewRelationService {

    ResponseWrapper<?> getAllReviews(String articleId);

    ResponseWrapper<?> updateReview(UpdateReviewRequest request);

    ResponseWrapper<?> reviewConfirm(ReviewConfirmRequest request);

    ResponseWrapper<?> getInfoOfReview(String pcMemberName, String meetingName);

    ResponseWrapper<?> getInfoOfArticleToReview(String pcMemberName, String articleId);

    ResponseWrapper<?> review(ReviewRequest request);

    ResponseWrapper<?> getAlreadyReviewedInfo(String pcMemberName, String articleId);

    ResponseWrapper<?> beginReview(BeginReviewRequest request);

}
