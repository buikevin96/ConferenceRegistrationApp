package com.kevinbui.service;

import com.kevinbui.model.Speaker;
import com.kevinbui.repository.HibernateSpeakerRepositoryImpl;
import com.kevinbui.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
