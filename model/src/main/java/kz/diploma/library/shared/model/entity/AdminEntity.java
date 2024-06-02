package kz.diploma.library.shared.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "admin")
@AllArgsConstructor
@NoArgsConstructor
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "sur_name")
    public String surname;

    @Column(name = "name")
    public String name;

    @Column(name = "last_name")
    public String lastName;

    @Column(name = "phone_number")
    public String phoneNumber;

    @Column(name = "password")
    public String password;

    @Column(name = "post")
    public String post;

    @Column(name = "registration")
    public String registration;
}
