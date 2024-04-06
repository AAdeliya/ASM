section .data
array db 2, 4, 6, 8, 10; an example array
array_size equ 5 ; number of elements in the array
user_variable dd 0 ; variable to store the sum

section .text
global _start

_start:
; initialize sum to zero
 mov eax, 0
mov dword [user_variable], eax

 ; add array elements to sum
 mov ecx, array_size; set loop counter to array size
 mov esi, array ; set esi to point to start of array
 add_loop:
 add eax, [esi] ; add current element to sum
 add esi, 1 ; move to next element in array
 loop add_loop; decrement loop counter and loop if not zero
 ; store sum in user variable
mov dword [user_variable], eax

; exit program
 mov eax, 1 ; exit system call
 xor ebx, ebx; exit status code
int 0x80 ; invoke kernel interrupt


//traversing an array

section .data
my_array db 1, 2, 3, 4, 5 ; An array of 5 bytes
array_length equ 5         ; Define the length of the array

section .text
    mov ecx, array_length  ; Set the loop counter
    mov esi, my_array      ; Set the pointer to the first element of the array

.loop_start:
    ; Do something with [esi], the current element of the array

    add esi, 1             ; Move to the next element in the array
    loop .loop_start       ; Decrement ecx and loop if ecx is not zero