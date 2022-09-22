boolean jobsDone = true;

void setup()
{
  // Added '()' to method
  if (isJobDone()) {
    println("Job's done!");
  }
}

boolean isJobDone()
{
  return jobsDone;
}
