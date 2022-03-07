package com.app.gtt.repository;

import com.app.gtt.collections.HotelCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<HotelCollection, String> {
}
