package com.notes.app.service;

import com.notes.app.dto.RegisterRequest;
import com.notes.app.dto.UserResponse;

public interface UserService {
    UserResponse registerUser(RegisterRequest request);
}
