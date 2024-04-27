package kz.diploma.library.shared.model.repository;

import kz.diploma.library.shared.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {
    @Query(value = """
      SELECT p FROM ProductEntity p
        WHERE p.pan = :pan
      """)
    Optional<ProductEntity> findByPan(@Param("pan")String pan);

    @Query(value = """
      SELECT p FROM ProductEntity p
        WHERE p.rbs = :rbs
      """)
    Optional<ProductEntity> findByRbs(@Param("rbs")String rbs);
}
