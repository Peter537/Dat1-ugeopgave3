### Exercises with String and array


Task 1-4 træner base class operations og skrivning af klasser i "ren" Java. De skal kodes i en almindelig text editor uden Processing. Task 5 og 6 er i Processing miljøet.


Såfremt I sidder fast ved en opgave, så tag en kort pause og prøv igen. Hvis I stadig sidder fast ved den, så hop videre til den næste.
Generelt er det bedre at I får tænkt over alle opgaverne, end at I får løst dem allesammen fuldkommen. 
Endvidere er I meget velkommen til at tale sammen om opgaverne, men det forventes at I alle koder hver jeres løsning. 


Opgaverne skal ligesom sidste uge, afleveres på moodle, via et link til jeres github repo. 


## Task 1. Palindrome

  1.a Skriv en metode printIfPalindrome() som tager en tekststreng som argument og printer den HVIS den kan skrives bagfra uden at ændre sig. (
  <details>
  <summary>Hint</summary>
  <p>Lad dig inspirere i dokumentationen for String klassen</p>
</details>
  
  1.b Sørg for at metoden ikke er case-sensitiv.
  
  1.c Kald metoden fra main med argumentet "Den laks skal ned", for at teste den.

---

## Task 2. print en delmængde af et ord

I denne opgave skal du brug substring metoden.

2.a Lav en metode, printPartOfWord(), med tre parametre: 1. parameter er ordet, 2. parameter er index for det bogstav delmængden starter med og 3.  parameter er længden på delmængden
Ex: argumenterne "København", 1 og 4  skal give outputtet "øben". 


---


## Task 3 Leg med tal
3.a Create a class MathWork add a main method.

3.b Write a method 'divisible', that takes in an integer as a parameter and prints all values between 0 and 100 that are divisible by the parameter received. 
<details>
  <summary>Hint</summary>
  <p>you need to use the % operator</p>
</details>



3.c call the method from main 

3.d add the following array to the class: int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 }

3.e Write a method, 'getRandom' that returns a random element from the above array.

3.f Write a function that takes an integer as a parameter and prints the number. After that, it subtracts one from the input and calls itself again (recursion). If the input is less than zero, it should no longer call itself. 


## Task 4 Fibonacci
4.a Write a method, fibonacci that takes two integers as parameters and prints the first of them.
 Each printed value should followed by a tab ( \\t ). Then have the function calculate and print the fibunacci sequence (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144) by calling itself. If the input is greater than 1000, then stop. Start the function by calling it from main with the input (1, 1).
 <details>
  <summary>Hint</summary>
  <p>how to calculate the fibonacci sequence: https://en.wikipedia.org/wiki/Fibonacci_number</p>
</details>


---

## Task 5 (Debugging):
In the directory above named "Debugging", there are 10 different small sketches, each of which containing some kind of error. For each of the sketches, try to run it firstly, then have a look at the output and afterwards fix the error. You're done with the sketch, once it prints "Job's done". 

---

## Task 6: Draw a chess board using a nested for loop and a double int array. 
In this task you will create an integer array with 2 dimensions, that holds values of 0, 1, 0, 1, etc. The instructions below will help you get started. 

6.a Create a double int called board[][] with the length of 8 in both arrays. 

6.b In setup() create a double for loop that loops through the board and alternates between assigning the value of 0 and 1 (e.g. board[x][y] = 0;). 
<details>
  <summary>Hint</summary>
  <p>use the modulus operator</p>
</details>


6.c In draw() create a double for loop that loops through the board and draws a rect for each element with the sideLength of 40 (e.g. rect(x * sideLength, y * sideLength, sideLength, sideLength); )

6.d Before drawing the rect in the previous step, add a fill() statement, that fills with the value of 0 if the board[x][y] == 0 and  255 if the the board[x][y] == 1.

---

# Other exercises (optional)
If you got stuck or if you finished the above, following are 3 links to exercises, where there is something for all levels.

https://codingbat.com/java 

https://www.codecademy.com/catalog/language/java 
 
https://www.hackerrank.com/domains/java 

https://edabit.com/ 

https://www.programiz.com/java-programming 
