boolean jobsDone = true;

void setup()
{
  println(isValueGreaterThanThreshold(10, 5));
  println(isValueGreaterThanThreshold(4, 8));

  if (isJobDone()) {
    println("Job's done!");
  }
}

boolean isValueGreaterThanThreshold(int value, int threshold)
{
  // There needs to be a return type no matter what
  return value > threshold;
}

boolean isJobDone()
{
  return jobsDone;
}
