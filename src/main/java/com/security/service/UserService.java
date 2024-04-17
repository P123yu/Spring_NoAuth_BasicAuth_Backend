package com.security.service;



import com.security.model.UserModel;
import com.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel=userRepository.findByuserName(username).orElse(null);

        String userPassWord=userModel.getPassWord();


        String encodePassword=passwordEncoder.encode(userPassWord);

        return org.springframework.security.core.userdetails.User.builder().username(userModel.getUserName())
                .password(encodePassword).build();
    }
}
