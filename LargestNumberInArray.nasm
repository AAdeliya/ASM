section .data
    array   db  10, 30, 5, 40, 20   ; Example array
    arrayLen equ $ - array          ; Calculate the length of the array

section .text
    global findMaxElement

findMaxElement:
    mov eax, 0              ; Initialize max as 0
    mov ebx, 0              ; Initialize index as 0
    
start_loop:
    cmp ebx, arrayLen      ; Compare index with array length
    je end_loop            ; If index equals array length, exit loop
    
    movzx edx, byte [array + ebx]   ; Load current element into edx
    
    cmp edx, eax           ; Compare current element with max
    jle next_iteration     ; If current element is less than or equal to max, skip update
    
    mov eax, edx           ; Update max to current element
    
next_iteration:
    inc ebx                ; Increment index
    jmp start_loop         ; Continue loop
    
end_loop:
    ret                    ; Return max