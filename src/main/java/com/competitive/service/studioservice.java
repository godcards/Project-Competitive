package com.competitive.service;

import com.competitive.dao.StudioMapper;
import com.competitive.pojo.Studio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studioservice {
    @Autowired
    private StudioMapper studioMapper;

    public List<String> SelStudio(){
        return studioMapper.SelStudio();
    }

    public int InsStudio(String studioName){
        return studioMapper.InsStudio(studioName);
    }
}
