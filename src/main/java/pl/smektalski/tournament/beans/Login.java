/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.smektalski.tournament.beans;

import org.hibernate.Session;
import pl.smektalski.tournament.entities.Person;
import pl.smektalski.tournament.util.HibernateUtil;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;


/**
 * @author AdminPC
 */
@ManagedBean(name = "login")
@SessionScoped
public class Login implements Serializable {
    private boolean authenticated = false;
    private String login;
    private String password;


    public void logon(ActionEvent event) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Person person = new Person(1, "Słowik", "Paweł");
        session.save(person);
        session.getTransaction().commit();
        if (login.equals("admin") && password.equals("pass")) {
            authenticated = true;
        } else {
            authenticated = false;
        }
    }


    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
