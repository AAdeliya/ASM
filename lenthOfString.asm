_strlen:

  push  rcx            ; save and clear out counter
  xor   rcx, rcx

_strlen_next:

  cmp   [rdi], byte 0  ; null byte yet?
  jz    _strlen_null   ; yes, get out

  inc   rcx            ; char is ok, count it
  inc   rdi            ; move to next char
  jmp   _strlen_next   ; process again

_strlen_null:

  mov   rax, rcx       ; rcx = the length (put in rax)

  pop   rcx            ; restore rcx
  ret                  ; get out



  ; strlen(hello)
mov   rdi, hello    ; rdi is the string we want to 
                    ; get the length of

call  _strlen       ; get the length!

mov   rdx, rax      ; rdx now holds the string length
                    ; ready for our write syscall

; write(fd, buf, len)
mov   rax, 4        ; syscall 4 == write
mov   rbx, 1        ; fd = 1 == stdout
mov   rcx, hello    ; the string to write
int   0x80          ; print the string