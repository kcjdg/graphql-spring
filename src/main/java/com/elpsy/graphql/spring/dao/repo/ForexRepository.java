package com.elpsy.graphql.spring.dao.repo;


import com.elpsy.graphql.spring.dao.entity.Forex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface ForexRepository extends JpaRepository<Forex, Integer> {
    Optional<Forex> findFirstByCode(String code);
}
