//Gotta get them boolan values
#define TRUE 1
#define FALSE 0

#include <iostream>
#include "ToyFactory.cpp"
using namespace std;



int main() {

	int type;
	while (TRUE) {
		cout << endl << "Enter type or enter Zero to exit" << endl;
		cin >> type;

		if (!type) {
			break;
		}

		Toy *toy = ToyFactory::createToy(type);
		if (toy) {
			toy->showProduct();
			delete toy;
		}
	}
	cout << "Exiting..." << endl;

	return 0;
}