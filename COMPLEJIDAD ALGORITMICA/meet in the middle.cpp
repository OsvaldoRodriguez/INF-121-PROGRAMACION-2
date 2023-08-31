void solve(){
    int n;                                              // 1                                             
    long long T;                                        // 1
    read(n, T);                                         // 1

    for(int i = 0; i < n; i++){                         // n + 1
        read(v[i]);                                     // n
    }
    
    vector<long long> L;                                // 1                                       
    int N1 = n / 2 + 1;                                 // 1

    int N2 = n - N1;                                    // 1
    

    for(int mask = 0; mask < (1 << N1); mask++){        // 2^(n / 2) + 1
        ll sum = 0;                                     // 2^(n / 2)
        for(int i = 0; i < N1; i++){                    // 2^(n / 2) * (n / 2 + 1)
            if(mask & (1 << i))                         // 2^(n / 2) * (n / 2)
                sum += v[i];                            // 2^(n / 2) * (n / 2)
        }
        L.push_back(sum);                               // 2^(n / 2)
    }
    
    ll ans = 0;                                         // 1

    for(int mask = 0; mask < (1 << N2); mask++){        // 2^(n / 2) + 1
        ll sum = 0;                                     // 2^(n / 2)
        for(int i = 0; i < N2; i++){                    // 2^(n / 2) * (n / 2 + 1)
            if(mask & (1 << i))                         // 2^(n / 2) * (n / 2)
                sum += v[i + N1];                       // 2^(n / 2) * (n / 2)
        }

        if(sum > T)                                     // 2^(n / 2) 
            continue;                                   // 2^(n / 2)
        int a = 0;                                      // 2^(n / 2)
        int b = L.size();                               // 2^(n / 2)
        int mid;                                        // 2^(n / 2)
        while(b - a > 1){                               // 2^(n / 2) * (log2(2^(n / 2)) + 1)
            mid = (a + b) / 2;                          // 2^(n / 2) * log2(2^(n / 2))
            if(L[mid] <= T - sum)                       // 2^(n / 2) * log2(2^(n / 2))
                a = mid;                                // 2^(n / 2) * log2(2^(n / 2))
            else
                b = mid;                                // 2^(n / 2) * log2(2^(n / 2))
        }
        ans = max(ans, sum + L[a]);                     // 2^(n / 2)
    }
    print(ans);                                         // 1
}



T(n) = 11 + 2*n + 14*2^(n / 2) + 6 * 2^(n / 2)*(n / 2) + 4 * 2^(n / 2) * log2(2^(n / 2))
O(T(n)) = 10 * 2 ^(n / 2) * (n / 2)
O(n) = 2 ^ (n / 2) * (n / 2)


