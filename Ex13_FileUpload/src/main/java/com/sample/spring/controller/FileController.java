package com.sample.spring.controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sample.spring.domain.FileEntity;
import com.sample.spring.service.FileDataService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class FileController {
	@Autowired
	public FileDataService fileDataService;

	@PostMapping("/file")
	public ResponseEntity<?> uploadImage(@RequestParam(name = "images") List<MultipartFile> files) {
		List<String> uploadResult = files.stream().map(file -> {
			try {
				return fileDataService.uploadImageToFileSystem(file);
			} catch (IOException e) {
				e.printStackTrace();
				return "Failed to upload: " + file.getOriginalFilename(); // 실패 메시지를 반환
			}
		}).collect(Collectors.toList());

		return ResponseEntity.status(HttpStatus.OK).body(uploadResult); // 업로드 결과를 반환
	}

	@GetMapping("/file/{id}")
	public ResponseEntity<?> downImage(@PathVariable(name = "id") Long id) throws IOException {
		byte[] downLoadImage = fileDataService.downLoadImageFileSystem(id);

		if (downLoadImage != null) {
			return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(downLoadImage);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

	}

	@GetMapping("/filelist")
	public ResponseEntity<FileEntity> getFileDataList() {

		List<FileEntity> fileDataList = fileDataService.findAll();
		if (!fileDataList.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).body(null);
		} else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

}
