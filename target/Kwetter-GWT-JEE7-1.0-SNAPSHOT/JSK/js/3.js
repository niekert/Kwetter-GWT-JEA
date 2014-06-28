var a = 1;

function f0() {
  this.a = 5;
}

function run(){
    alert(new f0().a);
    alert(a);
    f0();
    alert(a);
}