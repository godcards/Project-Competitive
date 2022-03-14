package com.competitive.service;

import com.competitive.dao.StudioMapper;
import com.competitive.pojo.Studio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studioservice {
    @Autowired
    private StudioMapper studioMapper;

    public List<String> SelectAllStudio(){
        return studioMapper.SelectAllStudio();
    }

    public int InsertStudio(Studio studio){
        return studioMapper.InsertStudio(studio);
    }

    public int UpdateStudio(Studio studio){
        return studioMapper.UpdateStudio(studio);
    }
}
