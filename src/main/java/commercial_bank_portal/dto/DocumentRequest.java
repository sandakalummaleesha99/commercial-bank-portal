package commercial_bank_portal.dto;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DocumentRequest", namespace = "http://www.commercialbankportal.com/bankTransfer")
@XmlType(name = "", propOrder = {
        "header",
        "employeeInfoS",
        "footer"
})
public class DocumentRequest {

    @XmlElement(name = "Header")
    private HeaderDTO header;

    @XmlElement(name = "EmployeeInfo")
    private List<EmployeeInfoDTO> employeeInfoS;

    @XmlElement(name = "Footer")
    private FooterDTO footer;
}
