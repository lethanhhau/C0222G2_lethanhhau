package com.hau.service.impl;

import com.hau.model.Room;
import com.hau.repository.IRoomRepository;
import com.hau.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService implements IRoomService {

    @Autowired
    private IRoomRepository roomRepository;

    @Override
    public List<Room> getAllRoom() {
        return this.roomRepository.getAllRoom();
    }

    @Override
    public void setStatus(String roomCode) {
        this.roomRepository.setStatus(roomCode);
    }

    @Override
    public void updateStatus(Integer id) {
        this.roomRepository.updateStatus(id);
    }
}
