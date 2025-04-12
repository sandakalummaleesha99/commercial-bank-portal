package commercial_bank_portal.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "epfNo",
        "firstName",
        "middleName",
        "lastName",
        "NIC",
        "bankInfo"
})
public class EmployeeInfoDTO {

    @XmlElement(name = "EpfNo")
    private String epfNo;

    @XmlElement(name = "FirstName")
    private String firstName;

    @XmlElement(name = "MiddleName")
    private String middleName;

    @XmlElement(name = "LastName")
    private String lastName;

    @XmlElement(name = "NIC")
    private String NIC;

    @XmlElement(name = "BankInfo")
    private BankInfoDTO bankInfo;
}
