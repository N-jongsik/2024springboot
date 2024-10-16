package com.sample.spring.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sample.spring.domain.FileEntity;
import com.sample.spring.repository.FiledDataRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class FileDataService {
	private final String FOLDER_PATH = "c:\\images\\";

	@Autowired
	private FiledDataRepository filedDataRepository;

	public String uploadImageToFileSystem(MultipartFile file) throws IOException {
		log.info("upload file : " + file.getOriginalFilename());

		String filePath = FOLDER_PATH + file.getOriginalFilename();

		FileEntity fileData = filedDataRepository.save(FileEntity.builder().name(file.getOriginalFilename())
				.type(file.getContentType()).filePath(filePath).build());

		file.transferTo(new File(filePath));
		if (filePath != null) {
			return "file upload success!!!" + filePath;
		}
		return null;
	}

	public byte[] downLoadImageFileSystem(Long id) throws IOException {
		FileEntity fileData = filedDataRepository.findById(id).orElseThrow();

		String filePath = fileData.getFilePath();

		log.info("download fileData : " + filePath);

		return Files.readAllBytes(new File(filePath).toPath());
	}

	public List<FileEntity> findAll() {
		return filedDataRepository.findAll();
	}
}
