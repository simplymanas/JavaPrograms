package com.simplymanas.learning.tricky;

public class JoyOFHex {
    public static void main(String[] args) {
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
    }
}



//left operand is long
//right is a int
//widening primitive conversion
