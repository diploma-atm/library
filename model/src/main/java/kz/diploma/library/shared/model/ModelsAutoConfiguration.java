package kz.diploma.library.shared.model;

import kz.diploma.library.shared.model.entity.EntityScanner;
import kz.diploma.library.shared.model.repository.RepositoryScanner;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@AutoConfiguration
@EnableJpaAuditing
@EntityScan(basePackageClasses = EntityScanner.class)
@EnableJpaRepositories(basePackageClasses = RepositoryScanner.class)
public class ModelsAutoConfiguration {
}
