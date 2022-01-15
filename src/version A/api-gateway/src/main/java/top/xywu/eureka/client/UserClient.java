package top.xywu.eureka.client;

import top.xywu.eureka.domain.User;

public interface UserClient {
    User findByUsername(String username);
    User findById(long id);
}
