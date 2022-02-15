public class count8{
//Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 
//8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%)
// by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
public int count8(int n) 
{
    int n8 = 0;
    if (8 > n)
    {
        return 0;
    }
    else
    {
        if ( 8 == n % 10)
        {
         if( 8 == ((n/10)%10))
	   n8 = n8 = 2;
	 else 
	   n8 = 1;
        }
        else
        {
            n8 = 0;
        }
    }
    return n8 + count8(n / 10);  
}
}
