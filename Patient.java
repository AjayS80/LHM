package LHM.Entity;
import javax.persistence.*;
@Entity
@Table(name ="patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String patientName;
    private String address;
    private String email;
    private String contactNumber;
    private String history;

    @ManyToOne
    private Facility facility;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber(String contactNumber) {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getHistory() {
        return history;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Patient(" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", contactName='" + contactNumber + '\'' +
                ", history='" + history + '\'' +
                ", facility=" + facility +
                '}';
    }
}