package com.example.interview.entity;/*
@Author : shubham Gupta
@email  : shubham1908gupta@gmail.com
@date   : 08 Nov 2023
@desc   :
*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Albums")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Album {
    @Id
    private int id;
    private int userId;
    private String title;
}
