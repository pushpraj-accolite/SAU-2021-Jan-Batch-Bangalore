function sum(string) 
{
    var sum = 0;
    for (var i = 0; i < string.length; i++)
    {
        if (/[0-9]/.test(string[i]))
        {
            sum += parseInt(string[i]);
        }
    }
    return sum;
  }

var string = "1j1j1"
console.log(sum(string));