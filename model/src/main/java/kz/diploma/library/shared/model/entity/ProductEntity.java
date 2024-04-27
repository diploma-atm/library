package kz.diploma.library.shared.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @CreatedDate
    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "pan", unique = true, nullable = false)
    public String pan;

    @Column(name = "pin")
    public String pin;

    @Column(name = "cvv")
    public String cvv;

    @OneToOne(mappedBy = "product")
    public AccountEntity account;

    @Column(name = "rbs")
    public String rbs;

    @Column(name = "active")
    public Boolean active;

    @Column(name = "in_access")
    public Boolean inAccess;

    @Column(name = "out_access")
    public Boolean outAccess;

    @Column(name = "is_blocked")
    public Boolean isBlocked;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    public ClientEntity clientEntity;
}
