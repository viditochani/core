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
 * <p>Java class for Function_Instantiation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Function_Instantiation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="is_overriding_declaration_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="overriding" type="{}Overriding"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="is_not_overriding_declaration_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="not_overriding" type="{}Not_Overriding"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="generic_unit_name_q" type="{}Expression_Class"/>
 *         &lt;element name="generic_actual_part_ql" type="{}Association_List"/>
 *         &lt;element name="aspect_specifications_ql" type="{}Element_List"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Function_Instantiation", propOrder = {
    "sloc",
    "isOverridingDeclarationQ",
    "isNotOverridingDeclarationQ",
    "namesQl",
    "genericUnitNameQ",
    "genericActualPartQl",
    "aspectSpecificationsQl"
})
public class FunctionInstantiation {

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "is_overriding_declaration_q", required = true)
    protected FunctionInstantiation.IsOverridingDeclarationQ isOverridingDeclarationQ;
    @XmlElement(name = "is_not_overriding_declaration_q", required = true)
    protected FunctionInstantiation.IsNotOverridingDeclarationQ isNotOverridingDeclarationQ;
    @XmlElement(name = "names_ql", required = true)
    protected DefiningNameList namesQl;
    @XmlElement(name = "generic_unit_name_q", required = true)
    protected ExpressionClass genericUnitNameQ;
    @XmlElement(name = "generic_actual_part_ql", required = true)
    protected AssociationList genericActualPartQl;
    @XmlElement(name = "aspect_specifications_ql", required = true)
    protected ElementList aspectSpecificationsQl;

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
     * Gets the value of the isOverridingDeclarationQ property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionInstantiation.IsOverridingDeclarationQ }
     *     
     */
    public FunctionInstantiation.IsOverridingDeclarationQ getIsOverridingDeclarationQ() {
        return isOverridingDeclarationQ;
    }

    /**
     * Sets the value of the isOverridingDeclarationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionInstantiation.IsOverridingDeclarationQ }
     *     
     */
    public void setIsOverridingDeclarationQ(FunctionInstantiation.IsOverridingDeclarationQ value) {
        this.isOverridingDeclarationQ = value;
    }

    /**
     * Gets the value of the isNotOverridingDeclarationQ property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionInstantiation.IsNotOverridingDeclarationQ }
     *     
     */
    public FunctionInstantiation.IsNotOverridingDeclarationQ getIsNotOverridingDeclarationQ() {
        return isNotOverridingDeclarationQ;
    }

    /**
     * Sets the value of the isNotOverridingDeclarationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionInstantiation.IsNotOverridingDeclarationQ }
     *     
     */
    public void setIsNotOverridingDeclarationQ(FunctionInstantiation.IsNotOverridingDeclarationQ value) {
        this.isNotOverridingDeclarationQ = value;
    }

    /**
     * Gets the value of the namesQl property.
     * 
     * @return
     *     possible object is
     *     {@link DefiningNameList }
     *     
     */
    public DefiningNameList getNamesQl() {
        return namesQl;
    }

    /**
     * Sets the value of the namesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefiningNameList }
     *     
     */
    public void setNamesQl(DefiningNameList value) {
        this.namesQl = value;
    }

    /**
     * Gets the value of the genericUnitNameQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getGenericUnitNameQ() {
        return genericUnitNameQ;
    }

    /**
     * Sets the value of the genericUnitNameQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setGenericUnitNameQ(ExpressionClass value) {
        this.genericUnitNameQ = value;
    }

    /**
     * Gets the value of the genericActualPartQl property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationList }
     *     
     */
    public AssociationList getGenericActualPartQl() {
        return genericActualPartQl;
    }

    /**
     * Sets the value of the genericActualPartQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationList }
     *     
     */
    public void setGenericActualPartQl(AssociationList value) {
        this.genericActualPartQl = value;
    }

    /**
     * Gets the value of the aspectSpecificationsQl property.
     * 
     * @return
     *     possible object is
     *     {@link ElementList }
     *     
     */
    public ElementList getAspectSpecificationsQl() {
        return aspectSpecificationsQl;
    }

    /**
     * Sets the value of the aspectSpecificationsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementList }
     *     
     */
    public void setAspectSpecificationsQl(ElementList value) {
        this.aspectSpecificationsQl = value;
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
     *         &lt;element name="not_overriding" type="{}Not_Overriding"/>
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
        "notOverriding",
        "notAnElement"
    })
    public static class IsNotOverridingDeclarationQ {

        @XmlElement(name = "not_overriding")
        protected NotOverriding notOverriding;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the notOverriding property.
         * 
         * @return
         *     possible object is
         *     {@link NotOverriding }
         *     
         */
        public NotOverriding getNotOverriding() {
            return notOverriding;
        }

        /**
         * Sets the value of the notOverriding property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotOverriding }
         *     
         */
        public void setNotOverriding(NotOverriding value) {
            this.notOverriding = value;
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
     *         &lt;element name="overriding" type="{}Overriding"/>
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
        "overriding",
        "notAnElement"
    })
    public static class IsOverridingDeclarationQ {

        protected Overriding overriding;
        @XmlElement(name = "not_an_element")
        protected NotAnElement notAnElement;

        /**
         * Gets the value of the overriding property.
         * 
         * @return
         *     possible object is
         *     {@link Overriding }
         *     
         */
        public Overriding getOverriding() {
            return overriding;
        }

        /**
         * Sets the value of the overriding property.
         * 
         * @param value
         *     allowed object is
         *     {@link Overriding }
         *     
         */
        public void setOverriding(Overriding value) {
            this.overriding = value;
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
