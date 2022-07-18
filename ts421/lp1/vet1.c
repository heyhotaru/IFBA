#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

int main(){
	int seq[10], i, soma = 0;
	
	for(i = 0; i <= 9; i++){
		scanf("%d", &seq[i]);
	}
		for(i = 0; i <= 9; i++){
			soma = soma + seq[i];
		}
			printf("%d", soma);
	
	return 0;
}