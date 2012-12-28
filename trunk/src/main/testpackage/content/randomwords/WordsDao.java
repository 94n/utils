package testpackage.content.randomwords;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Word table operations
 * <p/>
 * User: mtitov
 * Date: 11/12/12
 * Time: 6:41 PM
 */
@Repository
public class WordsDao {

    /**
     * Database session factory
     */
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Add word to database
     *
     * @param word word to save
     */
    public void add(Word word) {
        sessionFactory.getCurrentSession().save(word);
    }

    /**
     * Get word by id
     *
     * @param id word id
     * @return word with given id
     */
    public Word get(int id) {
        return (Word) sessionFactory.getCurrentSession().get(Word.class, id);
    }


}
