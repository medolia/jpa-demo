package com.que.demo.h2AndJpa;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "t_user")
@Entity
public class UserInfo {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "id_card")
    private String idCard;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idCard='" + idCard + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

}
