package com.kevinbui.repository;

import com.kevinbui.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
