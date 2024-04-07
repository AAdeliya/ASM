Explanation:

linearSearch is a global function.
It initializes the index ecx to 0.
It starts a loop that compares the element at index ecx with the searchVal.
If the value is found, it returns the index.
If the value is not found after searching through the array, it returns -1.
This code assumes that the value to search for is stored in searchVal. The index of the first occurrence
 of the value is returned if found, otherwise, -1 is returned to indicate that the value was not found in the array.

 section .data
    array       db  10, 30, 5, 40, 20     ; Example array
    arrayLen    equ $ - array             ; Calculate the length of the array
    searchVal   db  40                     ; Value to search for

section .text
    global linearSearch

linearSearch:
    mov ecx, 0               ; Initialize index to 0
    
start_loop:
    cmp ecx, arrayLen       ; Compare index with array length
    je not_found            ; If index equals array length, value not found
    
    cmp byte [array + ecx], searchVal   ; Compare current element with searchVal
    je found                ; If found, exit loop
    
    inc ecx                 ; Increment index
    jmp start_loop          ; Continue loop

found:
    mov eax, ecx            ; Move index to eax (return value)
    ret

not_found:
    mov eax, -1             ; Return -1 if value not found
    ret