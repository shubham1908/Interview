package com.example.interview.dao;/*
@Author : shubham Gupta
@email  : shubham1908gupta@gmail.com
@date   : 08 Nov 2023
@desc   :
*/

import com.example.interview.entity.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumDao extends MongoRepository<Album, Integer> {
}
