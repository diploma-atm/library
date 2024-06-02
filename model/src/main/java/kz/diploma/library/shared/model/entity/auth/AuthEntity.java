package kz.diploma.library.shared.model.entity.auth;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "auth_keys")
public class AuthEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long apiKeyId;

    @Column(name = "start_date")
    public LocalDateTime startDate;

    @Column(name = "expiry_date")
    public LocalDateTime expiryDate;

    @Column(name = "terminated_date")
    public LocalDateTime terminatedDate;

    @Column(name = "phone_number", unique = true)
    public String phoneNumber;

    @Column(name = "api_key")
    public String apiKey;
}

