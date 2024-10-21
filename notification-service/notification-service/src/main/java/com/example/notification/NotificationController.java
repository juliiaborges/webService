package com.example.notification;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private List<Notification> notifications = new ArrayList<>();

    // Retorna todas as notificações
    @GetMapping("/")
    public List<Notification> getNotifications() {
        return notifications;
    }

    // Adiciona uma nova notificação
    @PostMapping("/")
    public Notification createNotification(@RequestBody Notification notification) {
        notifications.add(notification);
        return notification;
    }
}
