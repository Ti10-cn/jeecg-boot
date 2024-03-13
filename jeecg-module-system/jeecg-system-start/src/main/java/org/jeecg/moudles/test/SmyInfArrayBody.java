package org.jeecg.moudles.test;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author hezhangqi
 * @description test
 * @date 2024/3/12 15:02:43
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BODY")
public class SmyInfArrayBody {
    @XmlElement(name = "SmyInfArray")
    private List<SmyInfArray> smyInfArray;
    @XmlElement(name = "SmyDsc")
    private String smyDsc;
    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "SmyInfArray")
    public static class SmyInfArray {
        @XmlElement(name = "SmyCd")
        private String smyCd;
        @XmlElement(name = "SmyTp")
        private String smyTp;
        @XmlElement(name = "SmyDsc")
        private String smyDsc;

    }
}
