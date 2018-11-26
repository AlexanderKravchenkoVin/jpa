package task.entites;

import javax.persistence.*;

@Entity
public class PhoneNumber {
    @Id
    private @GeneratedValue Long id;
    private String operatorName;
    private String number;

    public PhoneNumber() {

    }

    public PhoneNumber(String operatorName, String number) {
        this.operatorName = operatorName;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}