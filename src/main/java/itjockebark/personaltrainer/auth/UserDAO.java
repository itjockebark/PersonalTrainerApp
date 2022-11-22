package itjockebark.personaltrainer.auth;
import itjockebark.personaltrainer.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDAO extends JpaRepository<User, String> {
    Optional<User> findUserByUsername(String username);

}
