public class count7{
//Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
//so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields 
//the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public int count7(int n) 
{
    int n7 = 0;
    if (7 > n)
    {
        return 0;
    }
    else
    {
        if ( 7 == n % 10)
        {
            n7 = 1;
        }
        else
        {
            n7 = 0;
        }
    }
    return n7 + count7(n / 10);  
}

