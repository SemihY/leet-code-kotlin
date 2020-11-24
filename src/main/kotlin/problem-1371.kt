import kotlin.math.max

/*
Given the string s, return the size of the longest substring containing each vowel an even number of times.
That is, 'a', 'e', 'i', 'o', and 'u' must appear an even number of times.


Example 1:

Input: s = "eleetminicoworoep"
Output: 13
Explanation: The longest substring is "leetminicowor" which contains two each of the vowels: e, i and o and zero of the vowels: a and u.
Example 2:

Input: s = "leetcodeisgreat"
Output: 5
Explanation: The longest substring is "leetc" which contains two e's.
Example 3:

Input: s = "bcbcbc"
Output: 6
Explanation: In this case, the given string "bcbcbc" is the longest because all vowels: a, e, i, o and u appear zero times.


Constraints:

1 <= s.length <= 5 x 10^5
s contains only lowercase English letters.
 */
fun findTheLongestSubstring(s: String): Int {
    val firstSeen = hashMapOf(Pair(0, -1))
    val vovelMap = hashMapOf(Pair('a', 0), Pair('e', 1), Pair('i', 2), Pair('o', 3), Pair('u', 4))

    var (result, notEven) = Pair(0, 0)

    s.toCharArray().forEachIndexed { index, it ->
        if(vovelMap.containsKey(it)){
            notEven = notEven xor (1 shl vovelMap[it]!!.plus(1))
        }
        if (firstSeen.containsKey(notEven)){
            result = max(result,index - firstSeen[notEven]!!)
        } else {
            firstSeen[notEven] = index
        }
    }

    return result
}