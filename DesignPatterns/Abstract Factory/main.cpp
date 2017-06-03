#include <iostream>
#include "CarFactory.cpp"

#define SIMPLE_CAR 1
//#define LUXURY_CAR 1
//Preprocessors to enable creation of different factories.
int main() {
	
	#ifdef SIMPLE_CAR
		CarFactory* factory = new SimpleCarFactory;

	#elif LUXURY_CAR
		CarFactory* factory = new LuxuryCarFactory;

	#endif

		Car *car = factory->buildWholeCar();
		car->printDetails();

		return 0;
}