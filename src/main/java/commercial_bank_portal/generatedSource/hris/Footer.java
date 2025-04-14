package commercial_bank_portal.generatedSource.hris;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ctrlSum"
})
@Getter
@Setter
public class Footer {
    @XmlElement(name = "CtrlSum")
    protected double ctrlSum;
}
