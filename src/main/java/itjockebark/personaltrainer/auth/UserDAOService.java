/*
package itjockebark.personaltrainer.auth;

import com.google.common.collect.Lists;
import itjockebark.personaltrainer.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

import static itjockebark.personaltrainer.security.UserRole.*;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Repository("user")
public class UserDAOService implements UserDAO {

    private final PasswordEncoder passwordEncoder;

    @PersistenceContext
    private EntityManager em;

    @Autowired
    public UserDAOService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<UserAuthentication> getUserByUsername(String username) {
        return getAuthenticationUsers()
                .stream()
                .filter(userAuthentication -> username.equals(user.getUsername()))
                .findFirst();
    }
*/


/*    private List<UserAuthentication> getAuthenticationUsers() {
        List<UserAuthentication> users = Lists.newArrayList(
                new UserAuthentication(
                        "kim",
                        passwordEncoder.encode("123"),
                        PERSONAL_TRAINER.getGrantedAuthorities(),
                        true,
                        true,
                        true,
                        true
                ),
                new UserAuthentication(
                        "stosse",
                        passwordEncoder.encode("123"),
                        ADMIN.getGrantedAuthorities(),
                        true,
                        true,
                        true,
                        true
                ),
                new UserAuthentication(
                        "mikel",
                        passwordEncoder.encode("123"),
                        CLIENT.getGrantedAuthorities(),
                        true,
                        true,
                        true,
                        true
                )
        );
        return users;
    }
}*/
