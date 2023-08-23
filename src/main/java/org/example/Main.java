package org.example;

import org.example.database.pool.ConnectionPool;
import org.example.database.repository.CompanyRepository;
import org.example.database.repository.UserRepository;
import org.example.ioc.Container;


public class Main {

    public static void main(String[] args) {
        var container = new Container();


//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//        var userService = new UserService(userRepository, companyRepository);


        var connectionPool = container.get(ConnectionPool.class);
        var userRepository = container.get(UserRepository.class);
        var companyRepository = container.get(CompanyRepository.class);
        var userService = container.get(UserService.class);
        // TODO: 23.08.2023 userService
    }
}