package testpackage.content.randomwords;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Word
 * User: mtitov
 * Date: 11/12/12
 * Time: 6:48 PM
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"value"})})
public class Word {

    /**
     * Word itself
     */
    private String value;

    /**
     * Constructor for hibernate
     */
    public Word() {

    }

    /**
     * Constructor for services
     *
     * @param value word
     */
    public Word(String value) {
        this.value = value;
    }

    /**
     * Get word
     *
     * @return word
     */
    public String getValue() {
        return value;
    }

    /**
     * Set word
     *
     * @param value word
     */
    public void setValue(String value) {
        this.value = value;
    }
}
