package ifmo.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for characterCondition complex type.
 *
 * <p>The following schema fragment specifies the expected         content contained within this class.
 *
 * <pre>
 * &lt;complexType name="characterCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="field" type="{http://webservices.ifmo/}field" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "characterCondition", propOrder = {
        "field", "value"
})
public class CharacterFieldValue {

    @XmlSchemaType(name = "string")
    protected Field field;
    @XmlSchemaType(name = "string")
    protected Object value;

    public CharacterFieldValue(Field field, Object value) {
        this.field = field;
        this.value = value;
    }

    public CharacterFieldValue() {
    }

    /**
     * Gets the value of the field property.
     *
     * @return possible object is
     * {@link Field }
     */
    public Field getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     *
     * @param value allowed object is
     *              {@link Field }
     */
    public void setField(Field value) {
        this.field = value;
    }


    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Character filed value {" +
                "field=" + field +
                ", value='" + value +
                "'}";
    }
}
