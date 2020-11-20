/*
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.


Note: You may assume the string contains only lowercase English letters.
 */

fun firstUniqChar(s: String): Int {
    val nonRepeatingCharacters = s.toCharArray().groupBy { it } .filterValues { it.size == 1 }.keys

    return if (nonRepeatingCharacters.isEmpty()) -1 else s.indexOf(nonRepeatingCharacters.first())
}