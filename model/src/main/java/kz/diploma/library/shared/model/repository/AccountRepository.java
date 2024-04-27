package kz.diploma.library.shared.model.repository;

import kz.diploma.library.shared.model.entity.AccountEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AccountRepository extends CrudRepository<AccountEntity, Integer> {
    @Query(value = """
        SELECT a FROM AccountEntity a
        WHERE a.accountNumber = :accountNumber
    """)
    Optional<AccountEntity> findByAccountNumber(@Param("accountNumber")String generatedCardNumber);
}
