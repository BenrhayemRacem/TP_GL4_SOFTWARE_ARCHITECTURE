package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(IResource resourceType)
    {
        int resourceId;  
        resourceId = resourceType.findFree();
        resourceType.markSlotBusy();     
        return resourceId;
    }

    public void free(IResource resourceType)
    {
       
            resourceType.markSlotFree();
          
    }

   
}
