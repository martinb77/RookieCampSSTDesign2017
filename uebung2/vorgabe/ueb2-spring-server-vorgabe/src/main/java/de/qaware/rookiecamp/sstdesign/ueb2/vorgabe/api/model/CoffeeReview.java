package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

public class CoffeeReview {

    private Integer evaluationId;
    private Integer taste;
    private Integer look;
    private String remarks;

    public CoffeeReview() {
    }

    public CoffeeReview(Integer evaluationId, Integer taste, Integer look, String remarks) {
        this.evaluationId = evaluationId;
        this.taste = taste;
        this.look = look;
        this.remarks = remarks;
    }

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getTaste() {
        return taste;
    }

    public void setTaste(Integer taste) {
        this.taste = taste;
    }

    public Integer getLook() {
        return look;
    }

    public void setLook(Integer look) {
        this.look = look;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "CoffeeReview{" +
                "evaluationId=" + evaluationId +
                ", taste=" + taste +
                ", look=" + look +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
