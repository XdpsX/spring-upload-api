package com.spring.storageservice.repository;

import com.spring.storageservice.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;
import java.util.Optional;

public interface StorageRepository extends JpaRepository <ImageData, Long> {

    Optional<ImageData> findByName(String fileName);
}
