package LHM.Entity;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="facility")
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String facilityName;
    private String facilityType;
    private LocalDateTime dateTime;
    private String referredBy;
    private String deposit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilitylype(String facilityType) {
        this.facilityType = facilityType;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "Patient(" +
                "id=" + id +
                ", facilityName='" + facilityName + '\'' +
                ", facilityType='" + facilityType + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", referredBy='" + referredBy + '\'' +
                ", deposit=" + deposit +
                '}';
    }

}
