package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyDao;

import java.util.List;

public class OracleDao implements MyDao<String, UserDTO> {
    @Override
    public void insert(UserDTO userDTO) {
        System.out.println("Inserted Oracle: "+userDTO);
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void select(String s) {

    }

    @Override
    public List<UserDTO> select() {
        return null;
    }
}
