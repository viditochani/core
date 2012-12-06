//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.06 at 08:46:22 AM CST 
//


package org.sireum.bakar.gnatxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Path_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Path_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="not_an_element" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="if_path" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="elsif_path" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="else_path" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="case_path" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="select_path" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="or_path" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="then_abort_path" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="case_expression_path" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="if_expression_path" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="elsif_expression_path" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="else_expression_path" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;group ref="{}pragmas_group"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Path_List", propOrder = {
    "notAnElementOrIfPathOrElsifPath"
})
public class PathList {

    @XmlElementRefs({
        @XmlElementRef(name = "dispatching_domain_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "optimize_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reviewable_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "then_abort_path", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "suppress_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "atomic_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "convention_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "elaborate_body_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unsuppress_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "storage_size_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "shared_passive_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "default_storage_pool_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "task_dispatching_policy_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "elaborate_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "restrictions_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "no_return_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "if_path", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inline_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "not_an_element", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "assert_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "list_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "elsif_path", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "discard_names_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "detect_blocking_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "import_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "independent_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "if_expression_path", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "priority_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "attach_handler_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "independent_components_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "preelaborable_initialization_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "volatile_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "atomic_components_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pure_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unchecked_union_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "assertion_policy_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remote_call_interface_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "case_path", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "else_expression_path", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "normalize_scalars_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "locking_policy_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "select_path", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "interrupt_priority_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "interrupt_handler_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "preelaborate_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "page_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pack_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inspection_point_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "elsif_expression_path", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remote_types_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "linker_options_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "queuing_policy_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "partition_elaboration_policy_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "priority_specific_dispatching_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cpu_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "volatile_components_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "elaborate_all_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "export_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "implementation_defined_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "asynchronous_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unknown_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "else_path", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "or_path", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "all_calls_remote_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "profile_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "case_expression_path", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "controlled_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "relative_deadline_pragma", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<Object>> notAnElementOrIfPathOrElsifPath;

    /**
     * Gets the value of the notAnElementOrIfPathOrElsifPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notAnElementOrIfPathOrElsifPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotAnElementOrIfPathOrElsifPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getNotAnElementOrIfPathOrElsifPath() {
        if (notAnElementOrIfPathOrElsifPath == null) {
            notAnElementOrIfPathOrElsifPath = new ArrayList<JAXBElement<Object>>();
        }
        return this.notAnElementOrIfPathOrElsifPath;
    }

}
