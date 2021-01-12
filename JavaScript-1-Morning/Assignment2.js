var string = "abshdkjaabckadbcAAVD";

var ans = "";
for(var i = 0; i <string.length; i++)
{
    if(/[A-Z]/.test(string[i]))
    {
        ans += string[i].toLowerCase();
    }
    else
    {
        ans += string[i].toUpperCase();
    }
}

console.log(ans);