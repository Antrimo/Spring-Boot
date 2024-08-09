package com.spring.journalApp.controller;

import com.spring.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/route")
public class JournalEntryControllerV2 {



    @GetMapping


    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        return true;

    }

    @GetMapping("id/{myId}")
    public JournalEntry getEntry(@PathVariable Long myId){
        return null;

    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntry(@PathVariable Long myId){
        return null;

    }

    @PutMapping("id/{myId}")
    public JournalEntry updateEntry(@PathVariable Long myId, @RequestBody JournalEntry myEntry){
        return null;

    }



}
