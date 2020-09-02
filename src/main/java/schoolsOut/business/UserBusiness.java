package schoolsOut.business;

import schoolsOut.model.User;
import schoolsOut.repository.UserRepository;
import java.util.List;

public class UserBusiness {
    UserRepository userRepository = new UserRepository();

    public User getUserByLogin(String login) {
        return userRepository.getUserByLogin(login);
    }


    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User saveUser(User user) {

        return userRepository.saveUser(user);
    }


    public void deleteUser(User user) {
        userRepository.deleteUser(user);

    }
}
