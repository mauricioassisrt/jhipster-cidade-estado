package br.com.academia.repository;

import br.com.academia.domain.Cidade;
import br.com.academia.domain.Estado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Estado entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

//    Page<Estado> findByEstadosUserLoginOrderByDateDesc(String currentUserLogin, Pageable pageable);
}
