package com.MiniMe.CoreFileManagement.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private Long fileSize;
    private Date uploadDate;
    @Lob
    private byte[] fileContent;

    @PrePersist
    protected void onCreate() {
        this.uploadDate = new Date();
    }
}
