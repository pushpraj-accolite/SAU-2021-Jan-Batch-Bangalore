function isSame(n)
{
    var prev = Math.floor(n%10);
    n = Math.floor(n/10);

    while(n != 0)
    {
        if(n % 10 != prev)
        {
            return false;
        }
        n = Math.floor(n/10);
    }
    return true;
}

var n = 77777;
console.log(isSame(n));