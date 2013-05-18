/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.smektalski.tournament.entities;

/**
 *
 * @author AdminPC
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", catalog = "tournament")
public class Person implements java.io.Serializable {

    private Integer usersId;
    private String surname;
    private String name;

    public Person() {
    }

    public Person(Integer usersId, String surname, String name) {
        this.usersId = usersId;
        this.surname = surname;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "USERS_ID", unique = true, nullable = false)
    public Integer getUsersId() {
        return this.usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    @Column(name = "SURNAME", nullable = false, length = 20)
    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "NAME", nullable = false, length = 10)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}