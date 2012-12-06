//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.06 at 08:46:22 AM CST 
//


package org.sireum.bakar.gnatxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Component_Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Component_Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="has_aliased_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="aliased" type="{}Aliased"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="component_definition_view_q" type="{}Definition_Class"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Component_Definition", propOrder = {
    "sloc",
    "hasAliasedQ",
    "componentDefinitionViewQ"
})
public class ComponentDefinition {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "has_aliased_q", required = true)
    protected ComponentDefinition.HasAliasedQ hasAliasedQ;
    @XmlElement(name = "component_definition_view_q", required = true)
    protected DefinitionClass componentDefinitionViewQ;

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
     * Gets the value of the hasAliasedQ property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentDefinition.HasAliasedQ }
     *     
     */
    public ComponentDefinition.HasAliasedQ getHasAliasedQ() {
        return hasAliasedQ;
    }

    /**
     * Sets the value of the hasAliasedQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentDefinition.HasAliasedQ }
     *     
     */
    public void setHasAliasedQ(ComponentDefinition.HasAliasedQ value) {
        this.hasAliasedQ = value;
    }

    /**
     * Gets the value of the componentDefinitionViewQ property.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionClass }
     *     
     */
    public DefinitionClass getComponentDefinitionViewQ() {
        return componentDefinitionViewQ;
    }

    /**
     * Sets the value of the componentDefinitionViewQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionClass }
     *     
     */
    public void setComponentDefinitionViewQ(DefinitionClass value) {
        this.componentDefinitionViewQ = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="aliased" type="{}Aliased"/>
     *         &lt;element name="not_an_element" type="{}Not_An_Element"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aliased",
        "notAnElement"
    })
    public static class HasAliasedQ {

        protected Aliased aliased;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the aliased property.
         * 
         * @return
         *     possible object is
         *     {@link Aliased }
         *     
         */
        public Aliased getAliased() {
            return aliased;
        }

        /**
         * Sets the value of the aliased property.
         * 
         * @param value
         *     allowed object is
         *     {@link Aliased }
         *     
         */
        public void setAliased(Aliased value) {
            this.aliased = value;
        }

        /**
         * Gets the value of the notAnElement property.
         * 
         * @return
         *     possible object is
         *     {@link NotAnElement }
         *     
         */
        public NotAnElement getNotAnElement() {
            return notAnElement;
        }

        /**
         * Sets the value of the notAnElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotAnElement }
         *     
         */
        public void setNotAnElement(NotAnElement value) {
            this.notAnElement = value;
        }

    }

}
