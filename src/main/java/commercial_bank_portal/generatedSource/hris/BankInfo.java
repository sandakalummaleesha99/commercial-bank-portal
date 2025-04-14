package commercial_bank_portal.generatedSource.hris;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "bankName",
        "bankAccount",
        "bankCode",
        "branchCode",
        "salary"
})
@Getter
@Setter
public class BankInfo {
    @XmlElement(name = "BankName", required = true)
    protected String bankName;

    @XmlElement(name = "BankAccount", required = true)
    protected String bankAccount;

    @XmlElement(name = "BankCode", required = true)
    protected String bankCode;

    @XmlElement(name = "BranchCode", required = true)
    protected String branchCode;

    @XmlElement(name = "Salary")
    protected double salary;
}
