package TraceAnalysis.domain;


import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.Set;

public class Article {

    private Long id;
    private String contributorName;
    private String meetingName;
    private String submitDate;
    private String title;
    private String articleAbstract;
    private String filePath;
    private String status;//accepted/rejected/queuing
    private Set<String> topic;

    private List<Author> authors;

    public Article() {}

    public Article(String contributorName, String meetingName, String submitDate, String title, String articleAbstract, String filePath, String status, Set<String> topic, List<Author> authors) {
        this.contributorName = contributorName;
        this.meetingName = meetingName;
        this.submitDate = submitDate;
        this.title = title;
        this.articleAbstract = articleAbstract;
        this.filePath = filePath;
        this.status = status;
        this.topic = topic;
        this.authors = authors;
    }

    public Article(Article article) {
        this.contributorName = article.getContributorName();
        this.meetingName = article.getMeetingname();
        this.submitDate = article.getSubmitDate();
        this.title = article.getTitle();
        this.articleAbstract = article.getArticleAbstract();
        this.filePath = article.getFilePath();
        this.status = article.getStatus();
        this.topic = article.getTopic();
        this.authors = article.getAuthors();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContributorName() {
        return contributorName;
    }

    public void setContributorName(String contributorName) {
        this.contributorName = contributorName;
    }

    public String getMeetingname() {
        return meetingName;
    }

    public void setMeetingname(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticleAbstract() {
        return articleAbstract;
    }

    public void setArticleAbstract(String articleAbstract) {
        this.articleAbstract = articleAbstract;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<String> getTopic() {
        return topic;
    }

    public void setTopic(Set<String> topic) {
        this.topic = topic;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
