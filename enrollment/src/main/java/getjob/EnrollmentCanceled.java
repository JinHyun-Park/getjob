package getjob;

public class EnrollmentCanceled extends AbstractEvent {

    private Long id;
    private Long recruitmentId;
    private Long qualificationId;
    private String job;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getRecruitmentId() {
        return recruitmentId;
    }

    public void setRecruitmentId(Long recruitmentId) {
        this.recruitmentId = recruitmentId;
    }
    public Long getQualificationId() {
        return qualificationId;
    }

    public void setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}