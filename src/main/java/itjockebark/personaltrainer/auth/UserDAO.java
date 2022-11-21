package itjockebark.personaltrainer.auth;

import itjockebark.personaltrainer.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDAO extends JpaRepository<User, String> {

}
