COMP 380 – Neural Networks
Project 1 – Perceptron Neural Networks

In this project, I will implement an artificial neural network system in Java to classify
letters in different fonts using the well-known perceptron learning algorithm.

Classification Results are saved in files with the following format:
Actual Output:
A
1 -1 -1 -1 -1 -1 -1
Classified Output:
A
1 -1 -1 -1 -1 -1 -1

The following are possible sample runs:
[Training on a training dataset]
Welcome to Perceptron Net!
1) Enter 1 to train the net on a data file
2) Enter 2 to test the net on a data file
3) Enter 3 to quit
1
Enter the training data file name:
sampleTR
Enter 0 to initialize weights to 0, enter 1 to initialize weights to random values between -0.5 and 0.5:
1
Enter the maximum number of training epochs:
100
Enter a file name to save the trained weight values:
sampleWT
Enter the learning rate alpha from 0 to 1 but not including 0:
0.5
Enter the threshold theta:
1.0
Enter the threshold to be used for measuring weight changes:
0.00001
Training converged after 4 epochs.
Welcome to our first neural network – A Perceptron Net!
1) Enter 1 to train the net on a data file
2) Enter 2 to test the net on a data file
3) Enter 3 to quit
2
Enter the trained net weight file name:
sampleWT
Enter the testing/deploying dataset file name:
sampleTS
Enter a file name to save the testing/deploying results:
sampleRT
Welcome to our first neural network – A Perceptron Net!
1) Enter 1 to train the net on a data file
2) Enter 2 to test the net on a data file
3) Enter 3 to quit
3
The typed project writeup (in PDF) to be submitted through GradeScope should
contain the following (in order) and each of them should begin with a new page
1. Cover page (course name, term, project info, your names, instructor name,
date, etc.)
2. Assertion statement about the project completeness, correctness and
punctuality
3. Summary of the projects
4. Sample runs (produced by the script command in Linux)
5. Source code (it must be well documented)
Enjoy your project!
