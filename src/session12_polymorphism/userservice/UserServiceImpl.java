package session12_polymorphism.userservice;

public class UserServiceImpl implements UserService {

    @Override
    public void createUser() {

    }

    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        UserService userService = userServiceImpl;
    }
}