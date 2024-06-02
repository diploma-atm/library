package kz.diploma.library.shared.model.repository;


import kz.diploma.library.shared.model.entity.AdminEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdminRepository extends CrudRepository<AdminEntity, Integer> {
    Optional<AdminEntity> findByPhoneNumber(String phoneNumber);
}
