#include <iostream>
using namespace std;

class Toy {
protected:
	//Some shitty values just to have somehting to work with
	string name;
	float prince;
public:
	//Some equaly shitty methods to have somehting to work with.
	virtual void prepareParts() = 0;
	virtual void combineParts() = 0;
	virtual void ohShitBossIsComing() = 0;
	virtual void tryToLookBusy() = 0;
	virtual void assembleParts() = 0;
	virtual void applyLabel() = 0;
	virtual void showProduct() = 0;

	// Fun fact =0 was choosen instad of pure or abstract because Bjarne Stroustrup saw no chance of getting a new keyword accepted.
	
};