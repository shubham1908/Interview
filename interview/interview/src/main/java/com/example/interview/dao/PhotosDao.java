package com.example.interview.dao;/*
@Author : shubham Gupta
@email  : shubham1908gupta@gmail.com
@date   : 08 Nov 2023
@desc   :
*/

import com.example.interview.entity.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PhotosDao extends MongoRepository<Photo, Integer> {

    List<Photo> findAllByAlbumId(int albumId);
}
