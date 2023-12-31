package PP.repository;

import PP.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    @Query("SELECT e FROM UserEntity e WHERE e.connect = 1")
    List<UserEntity> getConnect();

    @Query("SELECT e FROM UserEntity e WHERE e.name = :name")
    List<UserEntity> getByName(@Param("name") String name);
}