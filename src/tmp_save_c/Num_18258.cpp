#include <queue>
#include <string>
#include <iostream>

int main(){

    std::ios::sync_with_stdio(false);
    std::cin.tie(NULL);

    int N;
    std::cin >> N;

    std::queue<int> que;
    std::string command;

    for(int i=0; i<N;i++){

        std::cin >> command;

        if(command == "push"){
            int X;
            std::cin >> X;

            que.push(X);

        }else if(command == "pop"){

            if(que.empty()){
                std::cout << "-1";
            }else{
                std::cout << que.front();
                que.pop();
            }

            std::cout << "\n";

        }else if(command == "size"){

            std::cout << que.size();
            std::cout << "\n";

        }else if(command == "empty"){

            std::cout << que.empty();
            std::cout << "\n";

        }else if(command == "front"){

            if(que.empty()){
                std::cout << "-1";
            }else{
                std::cout << que.front();
            }

            std::cout << "\n";

        }else if(command == "back"){

            if(que.empty()){
                std::cout << "-1";
            }else{
                std::cout << que.back();
            }

            std::cout << "\n";
        }


    }

    return 0;
}
