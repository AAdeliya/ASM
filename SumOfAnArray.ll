; Define the array
@array = constant [5 x i32] [i32 1, i32 2, i32 3, i32 4, i32 5]

define i32 @main() {
    ; Initialize sum to 0
    %sum = alloca i32
    store i32 0, i32* %sum
    
    ; Initialize loop variables
    %i = alloca i32
    store i32 0, i32* %i
    
    ; Start of loop
    br label %loop
    
loop:
    ; Load current index value
    %index = load i32, i32* %i
    
    ; Load current element from array
    %elementPtr = getelementptr [5 x i32], [5 x i32]* @array, i32 0, i32 %index
    %element = load i32, i32* %elementPtr
    
    ; Add current element to sum
    %currentSum = load i32, i32* %sum
    %newSum = add i32 %currentSum, %element
    store i32 %newSum, i32* %sum
    
    ; Increment loop counter
    %nextIndex = add i32 %index, 1
    store i32 %nextIndex, i32* %i
    
    ; Check loop condition
    %cmp = icmp slt i32 %nextIndex, 5
    br i1 %cmp, label %loop, label %endloop

endloop:
    ; Load final sum and return
    %finalSum = load i32, i32* %sum
    ret i32 %finalSum
}