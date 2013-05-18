/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.smektalski.tournament.DAO;

/**
 *
 * @author AdminPC
 */
import pl.smektalski.tournament.entities.Person;
import pl.smektalski.tournament.util.HibernateUtil;
import java.math.BigDecimal;
import org.hibernate.Query;

/**
 *
 * @author leonidas
 */
public class PersonDAOImpl extends GenericDAOImpl<Person, BigDecimal> implements PersonDAO {
    @Override
    public Person findByName(String name, String surname) {
        Person person = null;
        String sql = "SELECT p FROM Person p WHERE p.name = :name AND p.surname = :surname";
        Query query = HibernateUtil.getSession().createQuery(sql).setParameter("name", name).setParameter("surname", surname);
        person = findOne(query);
        return person;
    }
}