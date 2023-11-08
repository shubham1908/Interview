package com.example.interview.controller;/*
@Author : shubham Gupta
@email  : shubham1908gupta@gmail.com
@date   : 08 Nov 2023
@desc   :
*/


import com.example.interview.entity.AlbumResponse;
import com.example.interview.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/api/v1/album/{albumId}")
    public AlbumResponse getAlbum(@PathVariable int albumId){

        return albumService.getPhotos(albumId);
    }
}
