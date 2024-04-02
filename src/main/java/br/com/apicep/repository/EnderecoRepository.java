package br.com.apicep.repository;

import br.com.apicep.entity.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author marcos
 */

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String>{
    
}
