boolean jobsDone = true;
// 'false' changed to 'true'

void setup()
{
    if (isJobDone())
    {
        println("Job's done!");   
    }
}

// 'void' method changed to 'boolean'
boolean isJobDone()
{
    return jobsDone;    
}
