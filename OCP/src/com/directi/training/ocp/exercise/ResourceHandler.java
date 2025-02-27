package com.directi.training.ocp.exercise;

public interface ResourceHandler {
    int allocate();
    void free(int resourceId);
    int findFreeSlot();
    void markSlotBusy(int resourceId);
    void markSlotFree(int resourceId);
}