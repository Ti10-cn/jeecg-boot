package org.jeecg.moudles.test;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @author hezhangqi
 * @description test
 * @date 2024/3/12 15:00:46
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "service")
public class Service<T> {
    @XmlElement(name = "APP_HEAD")
    private String appHead;
    @XmlElement(name = "LOCAL_HEAD")
    private String localHead;
    @XmlElement(name = "SYS_HEAD")
    private String sysHead;
    @XmlAnyElement(lax = true)
    private T body;
}
