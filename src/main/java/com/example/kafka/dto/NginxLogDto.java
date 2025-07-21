package com.example.kafka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NginxLogDto {
    private String remoteAddr;
    private String remoteUser;
    private String timeLocal;
    private String request;
    private int status;
    private int bodyBytesSent;
    private String httpReferer;
    private String httpUserAgent;
    private String httpXForwardedFor;
} 