# Quiz Application 
---
### Admin Controller(Add questions one by one / Bulk)

- Table Structure
- id(pk),questions,options(Seperate with '|'),correct answer
- curl -X POST http://localhost:8080/admin/addSingleQuestions -H "Content-Type:application/json" -d '{"questions":"Capital of India","options":"Delhi | Mumbai","correctAns":1}'
- output of api
  {"id":4,"questions":"Capital of India","options":"Delhi,Mumbai","correctAns":1}

  