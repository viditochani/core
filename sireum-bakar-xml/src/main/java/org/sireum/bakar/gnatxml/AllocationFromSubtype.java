//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.06 at 08:46:22 AM CST 
//


package org.sireum.bakar.gnatxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Allocation_From_Subtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Allocation_From_Subtype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="subpool_name_q" type="{}Expression_Class"/>
 *         &lt;element name="allocator_subtype_indication_q" type="{}Element_Class"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allocation_From_Subtype", propOrder = {
    "sloc",
    "subpoolNameQ",
    "allocatorSubtypeIndicationQ"
})
public class AllocationFromSubtype {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "subpool_name_q", required = true)
    protected ExpressionClass subpoolNameQ;
    @XmlElement(name = "allocator_subtype_indication_q", required = true)
    protected ElementClass allocatorSubtypeIndicationQ;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the sloc property.
     * 
     * @return
     *     possible object is
     *     {@link SourceLocation }
     *     
     */
    public SourceLocation getSloc() {
        return sloc;
    }

    /**
     * Sets the value of the sloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceLocation }
     *     
     */
    public void setSloc(SourceLocation value) {
        this.sloc = value;
    }

    /**
     * Gets the value of the subpoolNameQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getSubpoolNameQ() {
        return subpoolNameQ;
    }

    /**
     * Sets the value of the subpoolNameQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setSubpoolNameQ(ExpressionClass value) {
        this.subpoolNameQ = value;
    }

    /**
     * Gets the value of the allocatorSubtypeIndicationQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementClass }
     *     
     */
    public ElementClass getAllocatorSubtypeIndicationQ() {
        return allocatorSubtypeIndicationQ;
    }

    /**
     * Sets the value of the allocatorSubtypeIndicationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementClass }
     *     
     */
    public void setAllocatorSubtypeIndicationQ(ElementClass value) {
        this.allocatorSubtypeIndicationQ = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
