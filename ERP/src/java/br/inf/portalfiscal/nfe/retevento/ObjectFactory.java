//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.28 at 03:45:05 PM BRT 
//


package br.inf.portalfiscal.nfe.retevento;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.inf.portalfiscal.nfe package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RetEnvEvento_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "retEnvEvento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.inf.portalfiscal.nfe
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TEvento.InfEvento }
     * 
     */
    public TEvento.InfEvento createTEventoInfEvento() {
        return new TEvento.InfEvento();
    }

    /**
     * Create an instance of {@link TEvento.InfEvento.DetEvento }
     * 
     */
    public TEvento.InfEvento.DetEvento createTEventoInfEventoDetEvento() {
        return new TEvento.InfEvento.DetEvento();
    }

    /**
     * Create an instance of {@link TEnvEvento }
     * 
     */
    public TEnvEvento createTEnvEvento() {
        return new TEnvEvento();
    }

    /**
     * Create an instance of {@link TRetEnvEvento }
     * 
     */
    public TRetEnvEvento createTRetEnvEvento() {
        return new TRetEnvEvento();
    }

    /**
     * Create an instance of {@link TRetEvento }
     * 
     */
    public TRetEvento createTRetEvento() {
        return new TRetEvento();
    }

    /**
     * Create an instance of {@link TEvento }
     * 
     */
    public TEvento createTEvento() {
        return new TEvento();
    }

    /**
     * Create an instance of {@link TProcEvento }
     * 
     */
    public TProcEvento createTProcEvento() {
        return new TProcEvento();
    }

    /**
     * Create an instance of {@link TRetEvento.InfEvento }
     * 
     */
    public TRetEvento.InfEvento createTRetEventoInfEvento() {
        return new TRetEvento.InfEvento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRetEnvEvento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "retEnvEvento")
    public JAXBElement<TRetEnvEvento> createRetEnvEvento(TRetEnvEvento value) {
        return new JAXBElement<TRetEnvEvento>(_RetEnvEvento_QNAME, TRetEnvEvento.class, null, value);
    }

}
