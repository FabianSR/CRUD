package com.prueba.persistence.repository;

import com.prueba.persistence.model.PruebaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PruebaRepository extends JpaRepository<PruebaEntidad, Long> {

    Optional<PruebaEntidad> findFirstByCampo(String campo);

    List<PruebaEntidad> findByIdBetween(Long a, Long b);

    /*@Query("select p from prueba p where p.id > :a and p.id < :b")
    List<PruebaEntidad> customSameQuery(@Param("a") Long a, @Param("b") Long b);*/

    @Query("SELECT o.id FROM otra o " +
            "LEFT JOIN FETCH o.prueba " +
            "WHERE o.prueba.id > 3 ")
    List<String> getO();
}