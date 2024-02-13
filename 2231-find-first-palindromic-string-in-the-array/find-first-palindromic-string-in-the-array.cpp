class Solution {
public:
    Solution() { ios_base::sync_with_stdio(false); cin.tie(NULL); }
    
    auto firstPalindrome(vector<string> words) -> string{
      auto const& result = find_if(cbegin(words), cend(words), [](auto const &word){
        return equal(cbegin(word), cbegin(word) + size(word) / 2, crbegin(word));
      });
      return result == cend(words) ? "" : *result;
    }
};