package TraceAnalysis.service.client;

import TraceAnalysis.domain.User;


public interface UserClient {
    User findByUsername(String username);
    User findById(long id);
}
