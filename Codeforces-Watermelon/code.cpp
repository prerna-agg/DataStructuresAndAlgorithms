#include<bits/stdc++.h>
using namespace std;

int main(){
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);

	int weight;
	cin>>weight;
	
	// because even - even =  even
	if(weight%2==0 && weight!=2 && weight!=0){
		cout<<"YES";
	}
	else{
		cout<<"NO";
	}

	return 0;
}
