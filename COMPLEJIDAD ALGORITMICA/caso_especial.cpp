#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(){
    long long n = 100;
    cin >> n;
    long long cont = 0; 
    for(long long i = 0; i < n * n; i++){
        for(long long j = n * n; j >= 1; j--){
            for(long long k = 0; k * k < n * n; k++){
                cont++;
            }
        }
    }

    cout << " primer contador " << cont << "\n";

    long long cnt2 = 0;
    
    for(long long i = 1; i <= n; i++)
        for(long long j = 1; j <= n; j++)
            for(long long k = 1; k <= n; k++)
                for(long long l = 1; l <= n; l++)
                    for(long long m = 1; m <= n; m++)
                        cnt2++;

    cout << " segundo contador " << cnt2 << "\n";

    return 0;
}


// T(n) = n ^ 5 + 1
// O(n) = n ^ 5
