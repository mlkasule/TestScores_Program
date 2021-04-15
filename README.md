Write a class named TestScores. The class constructor should accept an array of test scores as its argument.
The class should have a method that returns the average of the test scores. 
If any test score in the array is negative or greater than 100, the class should throw an IllegalArgumentException.

Demonstrate the class in a program (create a Driver class in the same file). 
The program should ask the user to input the number of test scores to be counted, and then each individual test score.
It should then make an array of those scores, create a TestScore object, and print the average of the scores.

If an IllegalArgumentException is thrown, the main method should catch it, print "Test scores must have a value less than 100 and greater than 0." and terminate the program.

Sample Run
java Driver

Enter·number·of·test·scores:5↵
Enter·test·score·1:70↵
Enter·test·score·2:65↵
Enter·test·score·3:94↵
Enter·test·score·4:55↵
Enter·test·score·5:90↵
74.8↵