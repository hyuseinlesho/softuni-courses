package bg.softuni.pathfinder.repository;

import bg.softuni.pathfinder.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);

    boolean existsByUsername(String username);
}
