/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval.eval.repositories;

import eval.eval.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Okala
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
    
}
