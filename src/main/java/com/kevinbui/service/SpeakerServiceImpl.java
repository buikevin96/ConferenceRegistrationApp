package com.kevinbui.service;

import com.kevinbui.model.Speaker;
import com.kevinbui.repository.HibernateSpeakerRepositoryImpl;
import com.kevinbui.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
