section .data

section .text
    global _start

_start:
    ; Calculate the factorial of 5 (5! = 120)
    mov eax, 5
    call factorial
    ; The result (120) is now stored in eax

    ; Exit the program
    mov eax, 1
    xor ebx, ebx
    int 0x80

; Factorial function using recursion
factorial:
    ; Check if eax is 0 (base condition)
    cmp eax, 0
    jz end_recursion

    ; Save the current value of eax
    push eax

    ; Decrement eax and call factorial function recursively
    dec eax
    call factorial

    ; Multiply the result returned in eax with the saved value of eax
    pop ebx
    imul eax, ebx

    ret

end_recursion:
    ; Return 1 when eax is 0 (base condition)
    mov eax, 1
    ret