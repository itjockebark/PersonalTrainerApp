package itjockebark.personaltrainer.dao;

import itjockebark.personaltrainer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, String> {
}
