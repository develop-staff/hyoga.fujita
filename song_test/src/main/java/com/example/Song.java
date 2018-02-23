package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.File;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "songs")

//現在一つのデータしか保持できないのでArrayを用いて配列型にしたい
public class Song {

    @Id
    @GeneratedValue

    private Integer id;
    private String fileName;
    private File file;
}
