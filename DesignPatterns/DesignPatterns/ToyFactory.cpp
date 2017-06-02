#include <iostream>
#include <string>
//#include "Toy.cpp"
//#include "Car.cpp"
//#include "Bike.cpp"
//#include "Plane.cpp"


#include "Object.cpp"
using namespace std;



class ToyFactory{
public:
	static Toy * createToy(int type) {
	
	Toy *toy = NULL;
	
	switch(type) {
		case 1:{
			toy = new Car;
			break;
		}
		case 2:{
			toy = new Bike;
			break;
		}
		case 3:{
			toy = new Plane;
			break;
		}
		default:{
			cout << "invalid toy type please re-enter type" << endl;
			return NULL;
		}
	}

	toy->prepareParts();
	toy->combineParts();
	toy->assembleParts();
	toy->applyLabel();
	
	return toy;
	}
	
};