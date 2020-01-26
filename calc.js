var first = document.getElementById("first").value;
var x = parseInt(first);
var second = document.getElementById("second").value;
var y = parseInt(second);
 


function myFunction(){
    var sum = x + y;
    var diff = x - y;
    document.getElementById("result").innerHTML = "sum = "+sum;
}
