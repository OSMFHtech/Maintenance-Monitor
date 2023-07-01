package com.example.Maintenance.Monitor.MessageController;
import com.example.Maintenance.Monitor.ServiceMessage.ServiceMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/message")
public class MessageController {
    private final ServiceMessage serviceMessage;
    @Autowired
    public MessageController(ServiceMessage serviceMessage) {
        this.serviceMessage = serviceMessage;
    }
    @GetMapping
    public String getMessage() {
        return serviceMessage.getContent();
    }
    @RequestMapping(value = "/set", method = {RequestMethod.GET, RequestMethod.POST})
    public String setMessage(@RequestParam("m") String content) {
        serviceMessage.setContent(content);
        return "ok";
    }
    @PostMapping("/reset")
    public String resetMessage() {
        serviceMessage.reset();
        return "ok";
    }
    @RequestMapping(value = "/reset", method = RequestMethod.GET)
    public String resetMessageGet() {
        serviceMessage.reset();
        return "ok";
    }
}



