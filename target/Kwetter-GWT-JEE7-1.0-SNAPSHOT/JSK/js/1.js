var a = 1;

function f0(a) {
  alert(a);
}

function f1(){
  var a = 3;
  alert(a);
}

function run(){
    f0(a);
    f0(7);
    f1();
};