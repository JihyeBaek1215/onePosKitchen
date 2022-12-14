package onepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KitchenRepository extends JpaRepository<Kitchen, Long>{
	
	List<Kitchen> findByOrderId(int orderId);
	List<Kitchen> findById(int id);
	List<Kitchen> findAllByStoreId(int storeId);
}