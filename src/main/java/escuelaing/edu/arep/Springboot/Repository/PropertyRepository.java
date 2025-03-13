package escuelaing.edu.arep.Springboot.Repository;

import escuelaing.edu.arep.Springboot.model.Property;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PropertyRepository extends CrudRepository<Property, Long>{
    Property findById(long id);
    List<Property> findByAddress(String address);
    List<Property> findByPrice(Double price);
    List<Property> findBySize(Double size);
}
