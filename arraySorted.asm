section .data
    array   db  1, 2, 3, 4, 5  ; Example array (sorted in ascending order)
    arrayLen equ $ - array      ; Calculate the length of the array

section .text
    global checkSortedArray
    
checkSortedArray:
    mov eax, 1              ; Assume array is sorted initially (true)
    mov ebx, 0              ; Initialize index to 0
    jmp start_loop          ; Start the loop
    
loop_iteration:
    mov ecx, ebx            ; Copy the index to ecx
    inc ecx                 ; Move to the next element
    movzx edx, byte [array + ecx]  ; Load the next element
    
    cmp edx, byte [array + ebx]   ; Compare current and next elements
    jge next_iteration            ; If next element >= current, continue loop
    
    mov eax, 0              ; If next element < current, array is not sorted
    jmp end_loop            ; Exit loop
    
next_iteration:
    inc ebx                 ; Move to the next element
start_loop:
    cmp ebx, arrayLen - 1   ; Check if end of array is reached
    jl loop_iteration       ; If not, continue loop
    
end_loop:
    ret