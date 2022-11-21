package itjockebark.personaltrainer.auth;

import itjockebark.personaltrainer.auth.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserService {

  @Autowired
  UserDAO userDAO;


/*    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userDAO
                .getUserByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException((String.format("Email %s not found", email))));
    }*/



}
