package com.workintech.zoo.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

public class ZooErrorResponse {
    private int status;
    private String message;
    private long timestamp;

    public ZooErrorResponse(int status, String message, long timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    public ZooErrorResponse() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ZooErrorResponse that = (ZooErrorResponse) o;
        return status == that.status && timestamp == that.timestamp && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message, timestamp);
    }
}
