package com.healthcare.demo.controller;

import com.healthcare.demo.entity.ContactMessage;
import com.healthcare.demo.service.ContactMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin
public class ContactMessageController {
    @Autowired
    private ContactMessageService contactMessageService;

    @PostMapping
    public ContactMessage submitContact(@RequestBody ContactMessage message) {
        return contactMessageService.saveMessage(message);
    }
}
