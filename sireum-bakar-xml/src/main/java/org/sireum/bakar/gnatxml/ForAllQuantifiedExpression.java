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
 * <p>Java class for For_All_Quantified_Expression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="For_All_Quantified_Expression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="iterator_specification_q" type="{}Declaration_Class"/>
 *         &lt;element name="predicate_q" type="{}Expression_Class"/>
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
@XmlType(name = "For_All_Quantified_Expression", propOrder = {
    "sloc",
    "iteratorSpecificationQ",
    "predicateQ"
})
public class ForAllQuantifiedExpression {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "iterator_specification_q", required = true)
    protected DeclarationClass iteratorSpecificationQ;
    @XmlElement(name = "predicate_q", required = true)
    protected ExpressionClass predicateQ;
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
     * Gets the value of the iteratorSpecificationQ property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationClass }
     *     
     */
    public DeclarationClass getIteratorSpecificationQ() {
        return iteratorSpecificationQ;
    }

    /**
     * Sets the value of the iteratorSpecificationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationClass }
     *     
     */
    public void setIteratorSpecificationQ(DeclarationClass value) {
        this.iteratorSpecificationQ = value;
    }

    /**
     * Gets the value of the predicateQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getPredicateQ() {
        return predicateQ;
    }

    /**
     * Sets the value of the predicateQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setPredicateQ(ExpressionClass value) {
        this.predicateQ = value;
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
