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
        "companyRegName",
        "companyRegNo"
})
public class HeaderDTO {

    @XmlElement(name = "CompanyRegName")
    private String companyRegName;

    @XmlElement(name = "CompanyRegNo")
    private String companyRegNo;
}