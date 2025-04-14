package commercial_bank_portal.generatedSource.hris;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "epfNo",
        "firstName",
        "middleName",
        "lastName",
        "nic",
        "bankInfo"
})
@Getter
@Setter
public class EmployeeInfo {
    @XmlElement(name = "EpfNo", required = true)
    protected String epfNo;

    @XmlElement(name = "FirstName", required = true)
    protected String firstName;

    @XmlElement(name = "MiddleName", required = true)
    protected String middleName;

    @XmlElement(name = "LastName", required = true)
    protected String lastName;

    @XmlElement(name = "NIC", required = true)
    protected String nic;

    @XmlElement(name = "BankInfo", required = true)
    protected BankInfo bankInfo;
}
