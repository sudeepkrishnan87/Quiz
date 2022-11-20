package com.barraiser.quiz.admin;

import com.barraiser.quiz.modal.QuestionBank;
import com.barraiser.quiz.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class adminController {
private AdminService adminService;

adminController(AdminService adminService)
{
    this.adminService=adminService;
}
@PostMapping(path="/addSingleQuestions",consumes = "application/json", produces = "application/json")

public ResponseEntity<QuestionBank> insertQuestions(@RequestBody QuestionBank questionBank)
{
    return ResponseEntity.ok().body(adminService.addSingleQuestion(questionBank));
}






}
