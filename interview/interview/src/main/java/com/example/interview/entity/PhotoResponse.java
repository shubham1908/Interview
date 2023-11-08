package com.example.interview.entity;/*
@Author : shubham Gupta
@email  : shubham1908gupta@gmail.com
@date   : 08 Nov 2023
@desc   :
*/


import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class PhotoResponse {
    private int Id;
    private String title;
    private String url;
    private String thumbnailUrl;
}
