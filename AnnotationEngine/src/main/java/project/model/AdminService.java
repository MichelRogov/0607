package project.model;

import project.engine.Service;
import project.engine.StartMethod;

@Service
public class AdminService {

    @StartMethod
    public void run() {
        System.out.println("admin service");
    }

    public void unRun() {
        System.out.println("DO NOT CALL ME");
    }
}
