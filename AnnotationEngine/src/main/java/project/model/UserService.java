package project.model;

import project.engine.Service;
import project.engine.StartMethod;

@Service
public class UserService {

    @StartMethod
    public void start(int param) {
        System.out.println("user service");
    }
}
