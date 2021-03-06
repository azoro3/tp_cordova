//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.07 at 04:37:58 PM CET 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for book complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="book">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="synopsis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="disponible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bibliotheque" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="geolocX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="geolocY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book", propOrder = {
    "name",
    "synopsis",
    "disponible",
    "bibliotheque",
    "geolocX",
    "geolocY"
})
public class Book {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String synopsis;
    protected boolean disponible;
    @XmlElement(required = true)
    protected String bibliotheque;
    protected double geolocX;
    protected double geolocY;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the synopsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * Sets the value of the synopsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynopsis(String value) {
        this.synopsis = value;
    }

    /**
     * Gets the value of the disponible property.
     * 
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * Sets the value of the disponible property.
     * 
     */
    public void setDisponible(boolean value) {
        this.disponible = value;
    }

    /**
     * Gets the value of the bibliotheque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBibliotheque() {
        return bibliotheque;
    }

    /**
     * Sets the value of the bibliotheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBibliotheque(String value) {
        this.bibliotheque = value;
    }

    /**
     * Gets the value of the geolocX property.
     * 
     */
    public double getGeolocX() {
        return geolocX;
    }

    /**
     * Sets the value of the geolocX property.
     * 
     */
    public void setGeolocX(double value) {
        this.geolocX = value;
    }

    /**
     * Gets the value of the geolocY property.
     * 
     */
    public double getGeolocY() {
        return geolocY;
    }

    /**
     * Sets the value of the geolocY property.
     * 
     */
    public void setGeolocY(double value) {
        this.geolocY = value;
    }

}
