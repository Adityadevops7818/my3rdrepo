# This is a comment. Comments start with a '#' and are ignored by the interpreter.

# Define a variable
name = "World"

# Define a function
def greet(person_name):
    """
    This function takes a name and returns a greeting string.
    This is a docstring, used to explain what the function does.
    """
    return f"Hello, {person_name}!"

# Call the function and store the result
greeting_message = greet(name)

# Print the result to the console
print(greeting_message)

# Perform a simple calculation
num1 = 10
num2 = 5
sum_result = num1 + num2
print(f"The sum of {num1} and {num2} is: {sum_result}")

# Demonstrate a conditional statement
age = 25
if age >= 18:
    print("You are an adult.")
else:
    print("You are a minor.")

# Demonstrate a loop
print("Counting from 1 to 3:")
for i in range(1, 4):  # range(start, end) generates numbers up to (end-1)
    print(i)
// Second code beigns here //
    # Program to check if a number is prime or not

num = 29

# To take input from the user
#num = int(input("Enter a number: "))

# define a flag variable
flag = False

if num == 0 or num == 1:
    print(num, "is not a prime number")
elif num > 1:
    # check for factors
    for i in range(2, num):
        if (num % i) == 0:
            # if factor is found, set flag to True
            flag = True
            # break out of loop
            break

    # check if flag is True
    if flag:
        print(num, "is not a prime number")
    else:
        print(num, "is a prime number")
