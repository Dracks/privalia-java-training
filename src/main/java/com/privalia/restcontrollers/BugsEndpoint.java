package com.privalia.restcontrollers;

import com.privalia.domain.Bug;

import com.privalia.services.BugsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BugsEndpoint extends AbstractEndpoint<List<Bug>> {
    @Autowired
    BugsService bugsService;

    public BugsEndpoint() {
        super("bugs");
    }

    @Override
    public List<Bug> invoke() {
        return bugsService.getBugs();
    }
}
