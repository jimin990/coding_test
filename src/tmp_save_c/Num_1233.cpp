#include <iostream>
#include <algorithm>


int main() {

	int S1, S2, S3;

	std::cin >> S1 >> S2 >> S3;

	int arr[81] = { 0 };

	for (int i = 1; i <= S1; i++) {
		for (int j = 1; j <= S2; j++) {
			for (int k = 1; k <= S3; k++) {

				arr[i + j + k]++;
			}
		}
	}

	int max = 0;
	int n = 0;


	for (int i = 0; i < 81; i++) {
		if (arr[i] > max || (arr[i] >= max) && i <= n) {

			max = arr[i];
			n = i;
		}
	}


	std::cout << n;

	return 0;
}