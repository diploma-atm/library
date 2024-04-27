package kz.diploma.library.shared.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "account_number", unique = true)
    public String accountNumber;

    @Column(name = "cash")
    public Long cash;

    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    public ProductEntity product;
}
