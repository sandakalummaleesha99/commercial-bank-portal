package commercial_bank_portal.wsdl.hris;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "companyRegName",
        "companyRegNo"
})
@Getter
@Setter
public class Header {
    @XmlElement(name = "CompanyRegName", required = true)
    protected String companyRegName;

    @XmlElement(name = "CompanyRegNo", required = true)
    protected String companyRegNo;
}
