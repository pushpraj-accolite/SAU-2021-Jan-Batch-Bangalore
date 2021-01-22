function primeFactors(n)  
{   
    var prime_factors = new Set();
    while (n % 2 == 0)  
    {  
        prime_factors.add(2);
        n = n/2;  
    }
   
    for ( let i = 3; i <= Math.sqrt(n); i = i + 2)  
    {  
        while (n % i == 0)  
        {  
            prime_factors.add(i);  
            n = n/i;  
        }  
    }  
 
    if (n > 2)  
        prime_factors.add(n);
    
    return prime_factors;
}  

var n = 315;
console.log(primeFactors(n));