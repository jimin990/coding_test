#include <stdio.h>
#include <iostream>
#include <string>
#include <cstring>
#include <sstream>
#include <algorithm>
#include <vector>

int main(){


    int maxLength[180] = {0};

    std::vector<std::string> vector;

    int status = 1;
    while(status){

        std::string input;

        std::getline(std::cin,input);

        if(input.empty()){
            status = 0;
            break;
        }

        vector.push_back(input);

        std::istringstream iss(input);

        std::string token;

        int i = 0;

        while(iss >> token){
            maxLength[i] = std::max(maxLength[i],(int)token.size());
            i++;
        }


    }

    for(int i =0; i< vector.size();i++){

        std::string str1 = vector[i];

        std::istringstream iss(str1);

        std::string token;

        std::vector<std::string> vec;

        while(iss >> token){
            vec.push_back(token);
        }

        for(int j =0; j < vec.size();j++){

            std::cout << vec[j];
            if(j != vec.size()-1){

                int space = maxLength[j]-(int)vec[j].size()+1;
                std::cout << std::string(space,' ');

            }

        }


        if(i != vector.size()-1){
            std::cout<< "\n";
        }


    }

    return 0;
}
