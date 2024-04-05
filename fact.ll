declare i32 @factorial(i32)            ------>This line declares an external function named factorial
                                       that takes an integer argument (i32) and returns an integer (i32). 




define i32 @main(i32 %argc, i8** %argv) {------->This line defines the main function, which is the entry point of the program. 
                                                It takes two arguments: an integer %argc (number of command line arguments) 
                                                and a pointer to an array of strings %argv (command line arguments).




%1 = call i32 @factorial(i32 2)       ----->This line calls the factorial function with an argument of 2. 
                                            It stores the result of the function call in %1.


                                            
%2 = mul i32 %1, 7                    ----->This line multiplies the result %1 (which is the factorial of 2)
                                            by 7 and stores the result in %2.

                                     



%3 = icmp eq i32 %2, 42                 ------>This line performs an integer comparison (icmp) to check if the value 
                                            in %2 is equal (eq) to 42. The result is stored in %3.   

%result = zext i1 %3 to i32 -----> This line zero-extends (zext) the boolean result %3 to an integer (i32). If %3 is true (1),
                                              it will be converted to 1; if it's false (0), 
                                              it will be converted to 0. The result is stored in %result.



ret i32 %result                       --------->This line returns the value stored in %result as the result of the main function.




Overall, this LLVM IR code calculates the factorial of 2, multiplies the result by 7, 
checks if the result is equal to 42, and returns 1 if it is and 0 if it isn't. I



}

%-virtual registers-local variables, predo registers, unnamed: %<number>
                                                      named:%<name>

 @ symbol means globals. These are used to name functions and string contstants.                                    


int factorial(int val);
int main(int argc, char** argv)
{
return factorial(2) * 7 == 42;
}

