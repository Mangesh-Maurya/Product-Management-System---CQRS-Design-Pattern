package com.cqrs.query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReadRepository extends JpaRepository<ProductReadModel, Long> {
}
