#include <iostream>
#include <string>

using namespace std;

class GameSetting {
	static GameSetting* _instance;
	int _brightness;
	int _width;
	int _height;
	int _discoFactor;
	GameSetting() : _width(786), _height(1300), _brightness(75) {} //Default parameters for constructor

public:
	static GameSetting* getInstace() {
		if (_instance == NULL) {
			cout << "Creating the instance" << endl;
			_instance = new GameSetting();
		}
		else {
			cout << "Returning existing instance" << endl;
			return _instance;
		}
		
	}
	void setWidth(int width) { _width = width; }
	void setHeight(int height) { _height = height; }
	void setBrighness(int brightness) { _brightness = brightness; }
	void setDiscoFactor(int discoFactor) { _discoFactor = discoFactor; }

	int getWidth() { return _width; }
	int getHeight() { return _height; }
	int getBrightness() { return _brightness; }
	int getDiscoFactor() { return _discoFactor; }
	void displaySetting() {
		cout << "Disco factor: " << _discoFactor << endl;
		cout << "brightness: " << _brightness << endl;
		cout << "height: " << _height << endl;
		cout << "width: " << _width << endl << endl;
	}
};

GameSetting * GameSetting::_instance = NULL;

void dummyFunction() {
	GameSetting *setting = GameSetting::getInstace();
	setting->displaySetting();
}

int main() {

	GameSetting *setting = GameSetting::getInstace();
	setting->displaySetting();
	setting->setBrighness(100);

	dummyFunction();

	cout << "Press any key to exit... " << endl;
	char c = getchar();//Just here to "pause console window instead of shutting it down when finished""

	return 0;
}