package models;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Account extends Model {

    @Id
    public long id;

    public String name;

    public String password;

}
