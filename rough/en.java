class test1
{
  int a,b,c,d;
  test1(){//constructor
    this(1,2,3);
  }
  test1(int a){
  this(8,5,69,1);
}
test1(int a,int b,int c){
  this(8);
}
test1(int a,int b,int c,int d){
  this.a=a;
  this.b=b;
  this.c=c;
  this.d=d;
}
//behaviour
public void details()
{
  System.out.println("the value of a"+a);
}
}
