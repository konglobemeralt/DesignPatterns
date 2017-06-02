#include <iostream>
#include <string>
#include "Toy.cpp"
using namespace std;

class Bike : public Toy {
	//Not gonna bother with constructors. #yolo
public:
	void prepareParts() { cout << "Preparing Bike parts" << endl; }
	void combineParts() { cout << "Combining Bike Parts" << endl; }
	void ohShitBossIsComing() { cout << "Whistle..." << endl; }
	void tryToLookBusy() { cout << "Do stuff to look busy..." << endl; }
	void assembleParts() { cout << "Assembling Bike Parts" << endl; }
	void applyLabel() { cout << "Applying Bike Label" << endl;  name = "Bike"; price = 20; }
	void showProduct() { cout << "Name: " << name << endl << "Price: " << price << endl; }
};