package com.example.springbootmongodb.repositories;

import com.example.springbootmongodb.entities.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}
