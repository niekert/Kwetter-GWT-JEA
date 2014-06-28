var a = 1;

function f0() {
  this.a = 7;
}

f0.prototype.a = -1;
f0.prototype.b = 8;

function run(){
    alert(new f0().a);
    alert(new f0().b);    
    alert(f0.prototype.a);
    alert(f0.prototype.b);    
    alert(a);
}