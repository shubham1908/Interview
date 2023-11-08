package com.example.interview.service;/*
@Author : shubham Gupta
@email  : shubham1908gupta@gmail.com
@date   : 08 Nov 2023
@desc   :
*/

import com.example.interview.dao.AlbumDao;
import com.example.interview.dao.PhotosDao;
import com.example.interview.entity.Album;
import com.example.interview.entity.AlbumResponse;
import com.example.interview.entity.Photo;
import com.example.interview.entity.PhotoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    @Autowired
    private PhotosDao photosDao;

    @Autowired
    private AlbumDao albumDao;

    public AlbumResponse getPhotos(int albumId){
        List<Photo> photos = photosDao.findAllByAlbumId(albumId);
        Optional<Album> album = albumDao.findById(albumId);
        List<PhotoResponse> photoResponses = new ArrayList<>();

        for(Photo photo: photos){
            PhotoResponse photoResponse = new PhotoResponse();
            photoResponse.setId(photo.getId());
            photoResponse.setUrl(photo.getUrl());
            photoResponse.setTitle(photo.getTitle());
            photoResponse.setThumbnailUrl(photo.getThumbnailUrl());
            photoResponses.add(photoResponse);
        }

        AlbumResponse albumResponse = new AlbumResponse();
        albumResponse.setId(album.get().getId());
        albumResponse.setTitle(album.get().getTitle());
        albumResponse.setPhotos(photoResponses);

        return albumResponse;
    }

}
