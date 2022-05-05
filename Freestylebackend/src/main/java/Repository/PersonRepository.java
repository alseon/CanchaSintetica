/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.Optional;
import models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public interface PersonRepository extends CrudRepository<Person,Long>{

    @Override
    public void delete(Person entity);

    @Override
    public void deleteById(Long id);

    @Override
    public boolean existsById(Long id);

    @Override
    public Iterable<Person> findAll();

    @Override
    public Optional<Person> findById(Long id);

    @Override
    public <S extends Person> S save(S entity);
    
}
