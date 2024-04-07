section .data
    array       db  10, 30, 5, 40, 20     ; Example array
    arrayLen    equ $ - array             ; Calculate the length of the array

section .text
    global reverseArray

reverseArray:
    mov ecx, 0                    ; Initialize start index to 0
    mov edx, arrayLen - 1         ; Initialize end index to arrayLen - 1
    
reverse_loop:
    cmp ecx, edx                  ; Check if start index < end index
    jge end_reverse               ; If not, exit loop
    
    mov al, [array + ecx]         ; Load element from start index
    mov ah, [array + edx]         ; Load element from end index
    
    mov [array + ecx], ah         ; Swap elements: move end element to start index
    mov [array + edx], al         ; Swap elements: move start element to end index
    
    inc ecx                       ; Increment start index
    dec edx                       ; Decrement end index
    
    jmp reverse_loop              ; Continue loop

end_reverse:
    ret                            ; Return from function



    //The function reverses the array by iterating over it from both ends towards the center, 
    swapping each element with its corresponding element from the other end, 
    until the start index crosses the end index. Finally, it returns from the function.

    //
Функция переворачивает массив, перебирая его с обоих концов к центру, 
заменяя каждый элемент соответствующим элементом с другого конца, 
пока начальный индекс не пересечет конечный индекс. Наконец, он возвращается из функции.