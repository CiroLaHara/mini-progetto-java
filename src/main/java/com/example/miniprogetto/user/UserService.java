package com.example.miniprogetto.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        Optional<User> userEamil = userRepository.findByEmail(user.getEmail());
        if (userEamil.isPresent()){
            throw new IllegalStateException("Utente già presente");
        }

        userRepository.save(user);

    }

    public void deleteUser(Long userId) {
        boolean existsUserId = userRepository.existsById(userId);
        if (!existsUserId){
            throw new IllegalStateException("L'utente con id "+ userId +" non esiste");
        }
        userRepository.deleteById(userId);
    }

    @Transactional
    public void updateUser(Long userId, String username, String email) {

        User user = userRepository.findById(userId)
                .orElseThrow(()-> new IllegalStateException("La user con il seguente id "+userId+" da aggiornare, non è più valido"));
        if (username != null &&
            !username.isEmpty() &&
            !Objects.equals(user.getUserName(), username)){
            user.setUserName(username);
        }

        if (email != null &&
                !email.isEmpty() &&
                !Objects.equals(user.getEmail(), email)){
            user.setUserName(email);
        }
    }
}
