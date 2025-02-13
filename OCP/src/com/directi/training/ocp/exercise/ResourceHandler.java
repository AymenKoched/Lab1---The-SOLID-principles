package com.directi.training.ocp.exercise;

public interface ResourceHandler {
    int allocate();
    void free(int resourceId);
}