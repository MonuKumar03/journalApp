//package com.mj.journalApp.repository;
//
//import com.mj.journalApp.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//
//import java.util.List;
//
//public class UserRepositoryImpl {
//
//    @Autowired
//    private MongoTemplate mongoTemplate;
//
//    public List<User> getUserForSA(){
//        Query query = new Query();
//        query.addCriteria(Criteria.where("email").regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z][a-z]{2,6}$"));
//        query.addCriteria(Criteria.where("userName").is("ramu"));
////        List<User> users = mongoTemplate.find(query, User.class);
////        return users;
//        return mongoTemplate.find(query, User.class);
//    }
//
//}
