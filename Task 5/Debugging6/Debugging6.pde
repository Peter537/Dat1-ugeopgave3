boolean jobsDone = true;

void setup()
{
  println(getRandomNumber(0, 10));
  if (isJobDone()) {
    println("Job's done!");   
  }
}

boolean isJobDone()
{
  return jobsDone;    
}

int getRandomNumber(int min, int max) 
{
  // Changed returntype from method random() from float to int with typecast
  return (int) random(min, max);
}
