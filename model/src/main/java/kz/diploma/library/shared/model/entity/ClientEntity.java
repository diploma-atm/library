package kz.diploma.library.shared.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "client")
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "sur_name")
    public String surname;

    @Column(name = "name")
    public String name;

    @Column(name = "last_name")
    public String lastName;

    @Column(name = "phone_number", unique = true)
    public String phoneNumber;

    @OneToMany(mappedBy = "id")
    public List<ProductEntity> products;

    @OneToMany(mappedBy = "id")
    public List<AccountEntity> accounts;

    @Column(name = "is_blocked")
    public Boolean isBlocked;
}
