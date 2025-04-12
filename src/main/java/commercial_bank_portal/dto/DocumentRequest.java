package commercial_bank_portal.dto;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DocumentRequest")
@XmlType(name = "", propOrder = {
        "header",
        "employeeInfoS",
        "footer"
})
public class DocumentRequest {

    @XmlElement(required = true)
    private HeaderDTO header;

    @XmlElement(name = "EmployeeInfoS", required = true)
    private List<EmployeeInfoDTO> employeeInfoS;

    @XmlElement(required = true)
    private FooterDTO footer;
}
