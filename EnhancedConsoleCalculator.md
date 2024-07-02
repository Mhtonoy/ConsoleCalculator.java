# Menu System:

    - I added a loop that displays a menu with options for different operations.
    - The user can choose an operation by entering the corresponding number.
    - Entering 0 exits the calculator.

# Error Handling:

    - I added error handling for invalid choices and non-numeric inputs.
    - If the user enters an invalid choice or a non-numeric input, appropriate error messages are displayed, and the user is prompted again.

# Additional Operations:

    - I added the performOperation method to handle different operations based on the user's choice.
    - Division by zero is now explicitly checked and handled.

# Refactoring:

    - I added helper methods (getChoice, getNumber) to handle user input and make the code more modular and readable.