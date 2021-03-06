package ifmo.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "character", propOrder = {
        "race",
        "id",
        "name",
        "hp",
        "heroClass",
        "exlevel"
})
public class Character {
    @XmlElement(name = "race", required = true)
    protected String race;
    @XmlElement(name = "id", required = true)
    protected int id;
    @XmlElement(name = "name", required = true)
    protected String name;
    @XmlElement(name = "hp", required = true)
    protected int hp;
    @XmlElement(name = "heroClass", required = true)
    protected String heroClass;
    @XmlElement(name = "exlevel", required = true)
    protected int exlevel;

    public Character(String race, int id, String name, int hp, String heroClass, int exlevel) {
        this.id = id;
        this.name = name;
        this.heroClass = heroClass;
        this.race = race;
        this.exlevel = exlevel;
        this.hp = hp;
    }

    public Character() {

    }

    /**
     * Gets the value of the race property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRace(String value) {
        this.race = value;
    }

    /**
     * Gets the value of the id property.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hp property.
     */
    public int getHp() {
        return hp;
    }

    /**
     * Sets the value of the hp property.
     */
    public void setHp(int value) {
        this.hp = value;
    }

    /**
     * Gets the value of the heroClass property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHeroClass() {
        return heroClass;
    }

    /**
     * Sets the value of the heroClass property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHeroClass(String value) {
        this.heroClass = value;
    }

    /**
     * Gets the value of the exlevel property.
     */
    public int getExlevel() {
        return exlevel;
    }

    /**
     * Sets the value of the exlevel property.
     */
    public void setExlevel(int value) {
        this.exlevel = value;
    }

    @Override
    public String toString() {
        return "Character {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", heroClass='" + heroClass + '\'' +
                ", race='" + race + '\'' +
                ", exlevel=" + exlevel +
                ", hp=" + hp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return id == character.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
