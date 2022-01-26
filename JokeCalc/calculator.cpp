/*
 * calculator.cpp
 *
 *  Created on: 2 дек. 2021 г.
 *      Author: LARANOTE
 */
#include<iostream>
#include<string>
#include<iomanip>
#include<stdlib.h>
#include<fstream>
#include"md5hash.h"

using namespace std;
fstream file;
typedef unsigned char byte;
class Calc{
public:
	string Name;
	int Pay, Long,N;
	int PayAll(){
		if(Name=="Салькова")Pay*=2;
		return Pay*Long;
	}
	void output(){
		cout<<setw(3)<<left<<N
				<<setw(12)<<left<<Name
				<<setw(8)<<left<<Pay
				<<setw(6)<<left<<Long
				<<setw(12)<<left<<PayAll()<<endl;

		file<<setw(3)<<left<<N
				<<setw(12)<<left<<Name
				<<setw(8)<<left<<Pay
				<<setw(6)<<left<<Long
				<<setw(12)<<left<<PayAll()<<endl;
		if(PayAll()==777)
			cout<<"The "<<Name<<" is blessed!"<<endl;
	}
	void input(int n){
		N=n+1;
		cout<<"Введите фамилию сотрудника: ";
		cin>>Name;
		if(Name=="exit") exit(0);
		cout<<"Введите зарплату (в час) сотрудника: ";
		cin>>Pay;
		cout<<"Введите часы работы: ";
		cin>>Long;
		cin.get();
	}
};

/*string space(string Name[3]){
	Name[0].length()>Name[1]

}*/

int main(){
	setlocale(LC_ALL, "Russian");
	string data="Salkova";
	string data_hex_digest;
	md5 hash;
	Calc Worker[3];
	for(int num=1;;num++){
		for(int i=0;i<3;i++)
			Worker[i].input(i);
		file.open("Log.txt",ios::app);
		file<<setw(3)<<left<<"N"
					<<setw(12)<<left<<"Фамилия"
					<<setw(8)<<left<<"ЗП(в/ч)"
					<<setw(6)<<left<<"Часы"
					<<setw(12)<<left<<"К выплате"<<endl;

		cout<<setw(3)<<left<<"N"
				<<setw(12)<<left<<"Фамилия"
				<<setw(8)<<left<<"ЗП(в/ч)"
				<<setw(6)<<left<<"Часы"
				<<setw(12)<<left<<"К выплате"<<endl;

		for(int i=0;i<3;i++)
			Worker[i].output();
		if(num%5==0){
			cout<<"Купите нашего слона всего за "<<(Worker[0].PayAll()>Worker[1].PayAll() and Worker[0].PayAll()>Worker[2].PayAll() ? Worker[0].PayAll():Worker[1].PayAll()>Worker[2].PayAll()?Worker[1].PayAll():Worker[2].PayAll())<<"!"<<endl;
		}
		file.close();
		//md5
		if(num%3==1){
		    hash.update(data.begin(), data.end());
		    hash.hex_digest(data_hex_digest);
		file.open("Mining.txt",ios::app);
		file<<data_hex_digest<<endl;
		data=data_hex_digest;
		file.close();
		}
	}
}

