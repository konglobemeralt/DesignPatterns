#include <iostream>
#include <string>
#include "Toy.cpp"
using namespace std;

class Car : public Toy {
	//Not gonna bother with constructors. #yolo
public:
	void prepareParts() { cout << "Preparing Car parts" << endl; }
	void combineParts() { cout << "Combining Car Parts" << endl; }
	void ohShitBossIsComing() { cout << "Whistle..." << endl; }
	void tryToLookBusy() { cout << "Do stuff to look busy..." << endl; }
	void assembleParts() { cout << "Assembling Car Parts" << endl; }
	void applyLabel() { cout << "Applying Car Label" << endl;  name = "Car"; price = 10; }
	void showProduct() { cout << "Name: " << name << endl << "Price: " << price << endl; }
};