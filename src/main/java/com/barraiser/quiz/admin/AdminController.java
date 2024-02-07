package com.barraiser.quiz.admin;

import com.barraiser.quiz.modal.QuestionBank;
import com.barraiser.quiz.services.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private AdminService adminService;

    AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping(path = "/addSingleQuestion", consumes = "application/json", produces = "application/json")

    public ResponseEntity<QuestionBank> insertQuestions(@RequestBody Optional<QuestionBank> questionBank) {
        return ResponseEntity.ok().body(adminService.addSingleQuestion(questionBank));
    }

    @PostMapping("/attach")
    public ResponseEntity<String> insertBulk(@RequestPart("file") MultipartFile file) {
        if (file.getOriginalFilename() == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
     return ResponseEntity.ok().body(adminService.addBulkQuestions(file));
    }
}

