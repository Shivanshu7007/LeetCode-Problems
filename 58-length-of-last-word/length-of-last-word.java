class Solution
{
public int lengthOfLastWord(String s)
{
s = s.trim();
int c = 0;
for(int i = 0; i < s.length(); i++)
{
if(s.charAt(i) == ' ')
{
c = 0;
continue;
}
else
c++;
}
return c;
}
}