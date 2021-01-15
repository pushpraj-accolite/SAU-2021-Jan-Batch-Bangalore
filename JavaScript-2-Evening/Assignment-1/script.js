
class string_class{
    constructor(string)
    {
        this.string = string;    
    };


    length_of_string(){
        return this.string.length;
    };

    string_to_upper(){
        return this.string.toUpperCase();
    };

    string_to_lower(){
        return this.string.toLowerCase();
    };

    vowel_in_string(){
        function vowelTest(s) {
            return (/^[aeiou]$/i).test(s);
          }
        var re = /^[aeiou]$/i;
        var vow ="";

        for(let i = 0; i < this.string.length;i++)
        {
            if(vowelTest(this.string[i])){
                vow += this.string[i] + " ";
    
            }
        }
        return vow;
    }


    cons_in_string(){
        function vowelTest(s) {
            return (/^[aeiou]$/i).test(s);
          }
        var re = /^[aeiou]$/i;
        var cons ="";

        for(let i = 0; i < this.string.length;i++)
        {
            if(!vowelTest(this.string[i])){
                cons += this.string[i] + " ";
    
            }
        }
        return cons;
    }

    is_digits(){
        for(let i = 0; i < this.string.length;i++)
        {
            if ((/[0-9]/.test(this.string[i])))
            {   
                console.log(this.string[i]);
                return true;
            }
        }
        return false;
    }
    
}

function call(){
    var string  = document.getElementById("input").value;

    var p = new string_class(string);

    document.getElementById("ans1").innerHTML = p.length_of_string();
    document.getElementById("ans2").innerHTML = p.string_to_upper();
    document.getElementById("ans3").innerHTML = p.string_to_lower();
    document.getElementById("ans4").innerHTML = p.vowel_in_string();
    document.getElementById("ans5").innerHTML = p.cons_in_string();
    if(p.is_digits())
    document.getElementById("ans6").innerHTML = "<span style='color:red'>it contains digits in it</span>";
    else
    document.getElementById("ans6").innerHTML = "<span style='color:green'>it doesn't contains digits in it</span>";
}


