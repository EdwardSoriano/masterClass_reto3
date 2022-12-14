package com.Ciclo3.reto_3.Controller;

import com.Ciclo3.reto_3.Models.Message;
import com.Ciclo3.reto_3.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<Message> getAllMessages(){
        return messageService.getAllMessage();
    }

    @GetMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable("id") int message_id){
        return messageService.getMessage(message_id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message insertMessage(@RequestBody Message message){
        return  messageService.insertMessage(message);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Message updateMessage(@RequestBody Message message){
        return messageService.updateMessage(message);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteMessage(@PathVariable("id") int message_id){
        return messageService.deleteMessage(message_id);

    }
}
