package com.cursomicro.primermicro.dto.XMl;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@XmlRootElement
public class SaludoResponseXmlDTO implements Serializable {

    private String saludo;
}
