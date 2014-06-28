var a = 1;

var f0 = (function(){
    var a = 6;
    return function(){
        return a;
    };
})();


function run(){
    alert( f0() );
    alert(a);
};