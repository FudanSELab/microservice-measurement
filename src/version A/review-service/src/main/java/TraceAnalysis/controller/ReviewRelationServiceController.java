package TraceAnalysis.controller;

import TraceAnalysis.request.meeting.BeginReviewRequest;
import TraceAnalysis.request.meeting.ReviewConfirmRequest;
import TraceAnalysis.request.meeting.ReviewRequest;
import TraceAnalysis.request.meeting.UpdateReviewRequest;
import TraceAnalysis.service.ReviewRelationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewRelationServiceController {

    @Autowired
    ReviewRelationService service;

    Logger logger = LoggerFactory.getLogger(ReviewRelationServiceController.class);

    @GetMapping("/user/reviews")
    public ResponseEntity<?> getAllReviewsOfArticle(String articleId){
        return ResponseEntity.ok(service.getAllReviews(articleId));
    }

    @PostMapping("/meeting/updateReview")
    public ResponseEntity<?> updateReview(@RequestBody UpdateReviewRequest request) {
        logger.debug("update Review: " + request.toString());
        return ResponseEntity.ok(service.updateReview(request));
    }

    @PostMapping("/meeting/reviewConfirm")
    public ResponseEntity<?> reviewConfirm(@RequestBody ReviewConfirmRequest request) {
        logger.debug("Review Confirm: " + request.toString());
        return ResponseEntity.ok(service.reviewConfirm(request));
    }

    @GetMapping("/meeting/reviewArticles")
    public ResponseEntity<?> getInfoOfReview(String pcMemberName,String meetingName) {
        logger.debug("Get review information: " + meetingName + " " + pcMemberName);
        return ResponseEntity.ok(service.getInfoOfReview(pcMemberName,meetingName));
    }

    @GetMapping("/meeting/reviewArticle")
    public ResponseEntity<?> getInfoOfArticleToReview(String pcMemberName,String articleId) {
        logger.debug("Get Article information: " + articleId + " Reviewer: " + pcMemberName);
        return ResponseEntity.ok(service.getInfoOfArticleToReview(pcMemberName,articleId));
    }

    @PostMapping("/meeting/reviewer")
    public ResponseEntity<?> review(@RequestBody ReviewRequest request) {
        logger.debug("Review: " + request.toString());
        return ResponseEntity.ok(service.review(request));
    }

    @GetMapping("/meeting/alreadyReviewedInfo")
    public ResponseEntity<?> getAlreadyReviewedInfo(String pcMemberName,String articleId) {
        logger.debug("Get Review information: " + articleId + " Reviewer: " + pcMemberName);
        return ResponseEntity.ok(service.getAlreadyReviewedInfo(pcMemberName,articleId));
    }

    @PostMapping("/meeting/beginReview")
    public ResponseEntity<?> beginReview(@RequestBody BeginReviewRequest request) {
        logger.debug("Begin Review: " + request.toString());
        return ResponseEntity.ok(service.beginReview(request));
    }

}
