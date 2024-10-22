package com.example.oracle.service;
import com.example.oracle.eexception.ResourceNotFoundException;
import com.example.oracle.repository.User;
import com.example.oracle.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@Slf4j
public class UserService {


    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User createUser(User user) {
        return userRepository.save(user);
    }


    public User getUser(Long userId) {
        User user =  userRepository.findById(userId).orElse(null);
        if(user==null){
            log.error("The user has not been found , userId="+userId);
            throw new ResourceNotFoundException("The user has not been found");
        }
        log.info("Find user by id: " + userId);
        return user;
    }

    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        log.info("Retrieved all users, total count: " + users.size());
        return users;
    }

    public User updateUser(Long userId, User updatedUser) {
        if (userRepository.existsById(userId)) {
            updatedUser.setId(userId);
            return userRepository.save(updatedUser);
        }
        return null;
    }


    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

}
