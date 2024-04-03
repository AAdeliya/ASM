.section TEXT,text
.global _start

_start:
    mov x0, #2
    mov x1, #3

    add x0, x0, x1

    add x0, x0, #48 

    mov x1, sp
    strb w0, [x1]
    mov x2, #1

    mov x0, #1
    mov x16, #4
    svc 0

    mov x0, #0
    mov x16, #1
    svc 0