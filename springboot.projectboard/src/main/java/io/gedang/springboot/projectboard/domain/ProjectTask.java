package io.gedang.springboot.projectboard.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class ProjectTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "summary cannot be blank")
    private String summary;
    private String acceptanceCriteria;
    private String status;

    public ProjectTask(){

    }

    public long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public String getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
