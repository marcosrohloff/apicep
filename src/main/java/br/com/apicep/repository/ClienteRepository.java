package br.com.apicep.repository;

import br.com.apicep.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author marcos
 */

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
}
