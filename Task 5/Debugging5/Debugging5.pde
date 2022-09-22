boolean jobsDone = true;

void setup()
{
  if (isJobDone()) {
    println("Job's done!"); // Added ';' to method
  }
}

boolean isJobDone()
{
  return jobsDone;
}
