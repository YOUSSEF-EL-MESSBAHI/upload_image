package com.files.uploadimg.repoitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.files.uploadimg.entity.ImageData;

public interface StorageRepository extends JpaRepository<ImageData,Long> {
	Optional<ImageData> findByName(String fileName);
}
