package com.directi.training.ocp.exercise;

public class SpaceSlotHandler implements ResourceHandler {
    @Override
    public int allocate() {
        int resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
    }
    
    @Override
    public void free(int resourceId) {
        markSlotFree(resourceId);
    }
    
    @Override
    public int findFreeSlot() {
        return 0;
    }
    
    @Override
    public void markSlotBusy(int resourceId) {
    }
    
    @Override
    public void markSlotFree(int resourceId) {
    }
}