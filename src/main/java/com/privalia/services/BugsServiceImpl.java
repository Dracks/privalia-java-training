package com.privalia.services;

import com.privalia.domain.Bug;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BugsServiceImpl implements BugsService {
    private List<Bug> listBugs;

    BugsServiceImpl(){
        this.listBugs = new LinkedList<>();
        this.listBugs.add(new Bug("Bug n:"+Double.toString(Math.random())));
        this.listBugs.add(new Bug("Bug n:"+Double.toString(Math.random())));
        this.listBugs.add(new Bug("Bug n:"+Double.toString(Math.random())));

    }
    @Override
    public List<Bug> getBugs() {
        return listBugs;
    }
}
