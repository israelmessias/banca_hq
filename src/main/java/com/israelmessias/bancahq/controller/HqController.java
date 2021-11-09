package com.israelmessias.bancahq.controller;

import com.israelmessias.bancahq.model.repository.HqRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hq")
@RequiredArgsConstructor
public class HqController {
    @Autowired
    private final HqRepository hqRepository;

    @GetMapping
    public String Hello()
    {
        return "Hello World";
    }
}
