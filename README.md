  # ✅ Task Scheduler API (Spring Boot)  

This is a **simple Task Scheduler API** built using **Spring Boot** without any database or repository layer. It uses **in-memory storage (ArrayList)** to store tasks temporarily.  

## 🚀 Features  
- 📅 **Schedule a Task** with a name and time.  
- 📋 **List All Tasks** that have been scheduled.  
- 💾 **No Database Used** – Just pure in-memory storage.  

---

## 📊 API Endpoints  

### ✔ Schedule a Task  
**Endpoint:**  
```
POST: http://localhost:8080/tasks/schedule?name=Meeting&time=2025-03-12T10:15:30
```  
**Response:**  
```
✅ Task scheduled successfully!
```

---

### ✔ List All Tasks  
**Endpoint:**  
```
GET: http://localhost:8080/tasks/list
```  
**Response:**  
```json
[
  {
    "id": "1a2b3c4d-5e6f-7g8h",
    "name": "Meeting with CEO",
    "scheduledTime": "2025-03-12T10:15:30"
  }
]
```

---

## 💻 How to Run  
1. Clone the project:  
```bash
git clone https://github.com/your-username/Task-Scheduler.git
```  
2. Build and run:  
```bash
mvn spring-boot:run
```  
3. Test APIs via Postman or Browser.  

---

## 📅 Date-Time Format  
👉 **Use ISO-8601 format** for scheduling tasks:  
```
2025-03-12T10:15:30
```

---

## ✅ Future Improvements (Optional)  
- 💾 Add Database (MySQL, H2).  
- ⏰ Auto-trigger tasks when scheduled time arrives.  
- 📧 Send email notifications.  

---

🚀 **Enjoy building!** 🚀  
👉 Let me know if you need any modifications. 😎  
