/**
 * @author Cory Howard - clhoward1
 * CIS175 - Spring 2024
 * Apr 24, 2024
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Tank;

@Repository
public interface TankRepository extends JpaRepository<Tank, Long>{

}
