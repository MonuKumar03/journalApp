package com.mj.journalApp.repository;

import com.mj.journalApp.entity.ConfigJournalAppEntity;
import com.mj.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {



}
