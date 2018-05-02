package czy.com.service;


import czy.com.model.User;

public interface UserService {

    User findByUsername(String username);
}
