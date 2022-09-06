//Program to divide the given string based on the given character

#include<bits/stdc++.h>
using namespace std;

vector<string> splitString(char str[], char ch){
  vector<string> ans;
  string str2;
  int j = 0;
  for(int i = 0; str[i] != '\0'; i++){
    if(str[i] == ch){
      ans.push_back(str2);
      str2.erase();
      i++;
    }
    str2.push_back(str[i]);

  }
  ans.push_back(str2);
  return ans;
}

int main(){
  char arr[1000];
  cin.getline(arr, 1000);
  vector<string> ans = splitString(arr, '/');
  for(int i = 0; i < ans.size(); i++){
    cout<<ans[i]<<endl;
  }
}
//In the above program the string arr will be divided into multiple strings and will be stored in the "ans" vector of strings