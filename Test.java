interface Test{
	void print();
	}
class A implements Test{
	public void print(){
		System.print.out("HELLO");
		}
	}

class TestSubject{
	pucblic static void main(String args[]){
		A obj = new A();
		Test obj2 = new A();
		//Test obj3 = new Test() will give compiler error as all methods are abstract and thier are static variables
		obj.print();
		obj2.print();
		obj
		}
	}
