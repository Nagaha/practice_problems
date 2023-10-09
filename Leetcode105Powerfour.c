bool isPowerOfFour(int n) {
    // Base case
    if (n == 1)
        return true;
    
    // If n is less than 4 or not divisible by 4, it's not a power of four
    if (n < 4 || n % 4 != 0)
        return false;

    // Recur for n divided by 4
    return isPowerOfFour(n / 4);
}
