package kz.diploma.library.shared.model.repository;


import kz.diploma.library.shared.model.entity.AdminEntity;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<AdminEntity, Integer> {
}
