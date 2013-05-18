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
import java.math.BigDecimal;

/**
 *
 * @author leonidas
 */
public interface PersonDAO extends GenericDAO<Person, BigDecimal> {
    public Person findByName(String name, String surname);
}