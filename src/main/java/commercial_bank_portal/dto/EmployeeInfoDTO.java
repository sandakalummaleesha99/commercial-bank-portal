package commercial_bank_portal.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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

    private String epfNo;
    private String firstName;
    private String middleName;
    private String lastName;
    private String NIC;
    private BankInfoDTO bankInfo;
}
