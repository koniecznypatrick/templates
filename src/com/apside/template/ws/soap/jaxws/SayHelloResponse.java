
package com.apside.template.ws.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.3.2
 * Wed Jun 26 16:02:49 CEST 2019
 * Generated source version: 3.3.2
 */

@XmlRootElement(name = "sayHelloResponse", namespace = "http://soap.ws.template.apside.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHelloResponse", namespace = "http://soap.ws.template.apside.com/")

public class SayHelloResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}
