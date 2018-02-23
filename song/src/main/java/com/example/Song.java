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
public class Song {

    @Id
    @GeneratedValue

    private Integer id;
    private String fileName;
    private File file;
}
