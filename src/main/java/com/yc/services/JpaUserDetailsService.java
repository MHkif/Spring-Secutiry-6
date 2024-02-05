package com.yc.services;

import com.yc.repositories.UserRepo;
import com.yc.wrappers.security.AuthenticatedUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {
    private final UserRepo userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) {
        var user = userRepository.findUserByUsername(username);
        return user.map(AuthenticatedUser::new)
                .orElseThrow(
                        ()-> new UsernameNotFoundException("Username not found : "+username)
                );
    }
}