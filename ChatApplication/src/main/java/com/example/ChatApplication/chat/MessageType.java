package com.example.ChatApplication.chat;

import lombok.Builder;

@Builder
public enum MessageType {

    CHAT,
    JOIN,
    LEAVE
}
