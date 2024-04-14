//the number 26, in decimal
//int decVal=26;
//The number 26, in hexadecimal
//int hexVal = 0x1a;
//The number 26, in binary
//int binVal= 0b110010;


//floating point literals
//double d1= 123.4;
//double d2= 1.2334e2;
//float f1=123.4f;
//*
// The following example shows other ways you can use the underscore in numeric literals:

// long creditCardNumber = 1234_5678_9012_3456L;
// long socialSecurityNumber = 999_99_9999L;
// float pi =  3.14_15F;
// long hexBytes = 0xFF_EC_DE_5E;
// long hexWords = 0xCAFE_BABE;
// long maxLong = 0x7fff_ffff_ffff_ffffL;
// byte nybbles = 0b0010_0101;
// long bytes = 0b11010010_01101001_10010100_10010010;
// You can place underscores only between digits; you cannot place underscores in the following places:

// At the beginning or end of a number
// Adjacent to a decimal point in a floating point literal
// Prior to an F or L suffix
// In positions where a string of digits is expected
// The following examples demonstrate valid and invalid underscore placements (which are highlighted) in numeric literals:

// // Invalid: cannot put underscores
// // adjacent to a decimal point
// float pi1 = 3_.1415F;
// // Invalid: cannot put underscores 
// // adjacent to a decimal point
// float pi2 = 3._1415F;
// // Invalid: cannot put underscores 
// // prior to an L suffix
// long socialSecurityNumber1 = 999_99_9999_L;

// // OK (decimal literal)
// int x1 = 5_2;
// // Invalid: cannot put underscores
// // At the end of a literal
// int x2 = 52_;
// // OK (decimal literal)
// int x3 = 5_______2;

// // Invalid: cannot put underscores
// // in the 0x radix prefix
// int x4 = 0_x52;
// // Invalid: cannot put underscores
// // at the beginning of a number
// int x5 = 0x_52;
// // OK (hexadecimal literal)
// int x6 = 0x5_2; 
// // Invalid: cannot put underscores
// // at the end of a number
// int x7 = 0x52_;*//
