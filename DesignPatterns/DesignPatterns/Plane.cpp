#include <iostream>
#include <string>
#include "Toy.cpp"
using namespace std;

class Plane : public Toy {
	//Not gonna bother with constructors. #yolo
public:
	void prepareParts() { cout << "Preparing Plane parts" << endl; }
	void combineParts() { cout << "Combining Plane Parts" << endl; }
	void ohShitBossIsComing() { cout << "Whistle..." << endl; }
	void tryToLookBusy() { cout << "Do stuff to look busy..." << endl; }
	void assembleParts() { cout << "Assembling Plane Parts" << endl; }
	void applyLabel() { cout << "Applying Plane Label" << endl;  name = "Plane"; price = 30; }
	void showProduct() { cout << "Name: " << name << endl << "Price: " << price << endl; }
};