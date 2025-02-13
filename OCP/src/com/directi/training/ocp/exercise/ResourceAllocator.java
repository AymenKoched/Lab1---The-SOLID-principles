package com.directi.training.ocp.exercise;

import java.util.HashMap;
import java.util.Map;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    private Map<ResourceType, ResourceHandler> resourceHandlers = new HashMap<>();

    public ResourceAllocator()
    {
        resourceHandlers.put(ResourceType.TIME_SLOT, new TimeSlotHandler());
        resourceHandlers.put(ResourceType.SPACE_SLOT, new SpaceSlotHandler());
    }

    public int allocate(ResourceType resourceType)
    {
        ResourceHandler handler = resourceHandlers.get(resourceType);
        if (handler != null) {
            return handler.allocate();
        } else {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return INVALID_RESOURCE_ID;
        }
    }

    public void free(ResourceType resourceType, int resourceId)
    {
        ResourceHandler handler = resourceHandlers.get(resourceType);
        if (handler != null) {
            handler.free(resourceId);
        } else {
            System.out.println("ERROR: Attempted to free invalid resource");
        }
    }
}
