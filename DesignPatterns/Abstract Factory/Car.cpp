#include <iostream>
#include <string>
using namespace std;

class Tire {
protected:
	string name;
	int pressure;
public:
	Tire(string n, int pressure) :name(n), pressure(pressure) {} //Parameterisation. name(n) is equal to this.name = name;
	string getName() { return name; }
	int getPressure() { return pressure; }
};

class SimpleTire : public Tire {
public:
	SimpleTire() :Tire("SimpleTire", 75) {}
};

class LuxuryTire : public Tire {
public:
	LuxuryTire() :Tire("LuxuryTire", 100) {}
};

class Body {
protected:
	string name;
	int strength;
public:
	Body(string n, int strength) :name(n), strength(strength) {}
	string getName() { return name; }
	int getStrength() { return strength; }
};

class SimpleBody : public Body {
public:
	SimpleBody() :Body("SimpleBody", 75) {}
};

class LuxuryBody : public Body {
public:
	LuxuryBody() :Body("LuxuryBody", 100) {}
};

class Car {
protected:
	string name;
	Tire *tire;
	Body *body;

public:
	Car(string n) : name(n) {}
		void setTire(Tire* t) { tire = t; }
		void setBody(Body* b) { body = b; }
		void printDetails() {
			cout << endl << "Car: " << name << endl;
			cout << "Tire: " << tire->getName() << " Presure: " << tire->getPressure() << endl;
			cout << "Body: " << body->getName() << " Strength: " << body->getStrength() << endl << endl;
		}
};