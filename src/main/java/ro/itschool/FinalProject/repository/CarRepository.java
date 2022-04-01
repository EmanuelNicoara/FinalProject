package ro.itschool.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ro.itschool.FinalProject.entity.BmwCar;

import javax.transaction.Transactional;
import java.util.List;


@Repository
public interface CarRepository extends JpaRepository<BmwCar, Long> {

    @Transactional
    @Modifying
    @Query("update BmwCar b set b.model= ?1 where b.id = ?2")
    void update( String model, Long id);

    @Query(value="select * from BmwCar b where b.model like %:keyword% or b.bodyType like %:keyword% or b.fuelType like %:keyword%", nativeQuery = true)
    List<BmwCar> findByKeyword(@Param("keyword") String keyword);

}


